<template>
  <div class="page">
    <div class="scene">
      <div class="glow pink"></div>
      <div class="glow violet"></div>
      <div class="glow pale"></div>
      <div class="orbit"></div>
    </div>

    <div class="glass-card">
      <div class="badge">profile</div>
      <h1>Edit Profile</h1>
      <p class="subtitle">Refine your details and personalize your account.</p>

      <form class="form" @submit.prevent="handleSave">
        <div class="avatar-block">
          <div class="avatar-preview" :style="{ backgroundImage: `url(${avatarPreview})` }"></div>
          <div class="avatar-meta">
            <label class="field-label">Profile Picture</label>
            <p>Upload a JPG or PNG file.</p>
            <label class="upload-btn">
              Change photo
              <input type="file" accept="image/*" @change="handleAvatarChange" />
            </label>
          </div>
        </div>

        <div class="field">
          <label>Email</label>
          <input v-model="form.email" type="email" placeholder="you@example.com" />
        </div>

        <div class="divider">Password</div>

        <div class="field">
          <label>Current Password</label>
          <input v-model="form.currentPassword" type="password" placeholder="Enter current password" />
        </div>
        <div class="field">
          <label>New Password</label>
          <input v-model="form.newPassword" type="password" placeholder="Create a new password" />
        </div>
        <div class="field">
          <label>Confirm New Password</label>
          <input v-model="form.confirmPassword" type="password" placeholder="Repeat new password" />
        </div>
      </form>

      <div class="cta">
        <button class="primary" type="submit">Save Changes</button>
        <button class="ghost" type="button" @click="handleCancel">Cancel</button>
      </div>
      <p class="hint">Tip: keep your info up to date for faster checkout.</p>
    </div>
  </div>
</template>

<script setup>
import { ref, reactive, onMounted, watch } from 'vue'

const defaultAvatar = 'data:image/svg+xml;utf8,' +
  encodeURIComponent(
    `<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 120 120">
      <defs>
        <linearGradient id="g" x1="0" y1="0" x2="1" y2="1">
          <stop offset="0" stop-color="#5f5b9f"/>
          <stop offset="1" stop-color="#c2a2ff"/>
        </linearGradient>
      </defs>
      <rect width="120" height="120" rx="60" fill="url(#g)"/>
      <circle cx="60" cy="46" r="22" fill="#1f2030" opacity="0.35"/>
      <rect x="26" y="74" width="68" height="30" rx="15" fill="#1f2030" opacity="0.35"/>
    </svg>`
  )

const STORAGE_KEY = 'customerEditProfileForm'

const avatarPreview = ref(defaultAvatar)

const form = reactive({
  email: 'nora@booknest.io',
  currentPassword: '',
  newPassword: '',
  confirmPassword: ''
})

const handleAvatarChange = (event) => {
  const file = event.target.files?.[0]
  if (!file) return

  const reader = new FileReader()
  reader.onload = () => {
    if (typeof reader.result === 'string') {
      avatarPreview.value = reader.result
    }
  }
  reader.readAsDataURL(file)
}

const handleSave = () => {
  sessionStorage.removeItem(STORAGE_KEY)
  // Placeholder for submit logic
}

const handleCancel = () => {
  form.currentPassword = ''
  form.newPassword = ''
  form.confirmPassword = ''
}

onMounted(() => {
  const cached = sessionStorage.getItem(STORAGE_KEY)
  if (!cached) return
  try {
    const parsed = JSON.parse(cached)
    if (parsed?.form) Object.assign(form, parsed.form)
    if (parsed?.avatarPreview) avatarPreview.value = parsed.avatarPreview
  } catch {
    sessionStorage.removeItem(STORAGE_KEY)
  }
})

watch(
  () => ({ form: { ...form }, avatarPreview: avatarPreview.value }),
  (value) => {
    sessionStorage.setItem(STORAGE_KEY, JSON.stringify(value))
  },
  { deep: true }
)
</script>

<style scoped>
:global(body) {
  background: #1e202c;
}

.page {
  min-height: 100vh;
  display: grid;
  place-items: center;
  padding: 32px 20px;
  color: #bfc0d1;
  background: radial-gradient(circle at top, rgba(96, 81, 155, 0.35), transparent 45%),
    linear-gradient(160deg, #1e202c 0%, #15151f 100%);
  font-family: "Inter", "Segoe UI", system-ui, sans-serif;
  position: relative;
  overflow: hidden;
}

.scene {
  position: absolute;
  inset: 0;
  pointer-events: none;
}

.glow {
  position: absolute;
  width: 280px;
  height: 280px;
  border-radius: 50%;
  filter: blur(8px);
  opacity: 0.75;
}

.glow.pink {
  background: radial-gradient(circle, rgba(191, 192, 209, 0.55), transparent 60%);
  bottom: 12%;
  right: 18%;
}

.glow.violet {
  background: radial-gradient(circle, rgba(96, 81, 155, 0.8), transparent 60%);
  top: 18%;
  left: 8%;
}

.glow.pale {
  background: radial-gradient(circle, rgba(191, 192, 209, 0.35), transparent 65%);
  bottom: 8%;
  left: 18%;
}

.orbit {
  position: absolute;
  width: 360px;
  height: 360px;
  border: 1px solid rgba(191, 192, 209, 0.12);
  border-radius: 50%;
  top: 18%;
  right: 12%;
}

.glass-card {
  position: relative;
  width: min(420px, 92vw);
  padding: 36px 30px 28px;
  background: linear-gradient(160deg, rgba(49, 50, 62, 0.65), rgba(30, 32, 44, 0.6));
  border-radius: 160px 160px 40px 40px;
  border: 1px solid rgba(191, 192, 209, 0.2);
  backdrop-filter: blur(18px);
  box-shadow: 0 32px 80px rgba(8, 8, 18, 0.6);
  text-align: center;
}

.badge {
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 2px;
  color: rgba(191, 192, 209, 0.75);
  margin-bottom: 12px;
}

.glass-card h1 {
  margin: 0;
  font-size: 28px;
  color: #f1f1f7;
}

.subtitle {
  margin: 8px 0 24px;
  font-size: 13px;
  color: rgba(191, 192, 209, 0.7);
}

.form {
  display: grid;
  gap: 14px;
  text-align: left;
  margin-bottom: 20px;
}

.avatar-block {
  display: grid;
  grid-template-columns: auto 1fr;
  gap: 16px;
  align-items: center;
  background: rgba(30, 32, 44, 0.55);
  border: 1px solid rgba(191, 192, 209, 0.12);
  border-radius: 18px;
  padding: 14px;
}

.avatar-preview {
  width: 84px;
  height: 84px;
  border-radius: 50%;
  background-size: cover;
  background-position: center;
  border: 2px solid rgba(191, 192, 209, 0.25);
  box-shadow: 0 12px 24px rgba(8, 8, 18, 0.35);
}

.avatar-meta {
  display: grid;
  gap: 6px;
}

.avatar-meta p {
  margin: 0;
  font-size: 12px;
  color: rgba(191, 192, 209, 0.6);
}

.field-label {
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 1px;
  color: rgba(191, 192, 209, 0.7);
}

.upload-btn {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  background: linear-gradient(135deg, #60519b, #b276ff);
  color: #f1f1f7;
  padding: 8px 14px;
  border-radius: 999px;
  font-size: 12px;
  cursor: pointer;
  width: fit-content;
}

.upload-btn input {
  display: none;
}

.divider {
  margin: 8px 0 2px;
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 1px;
  color: rgba(191, 192, 209, 0.55);
}

.field label {
  font-size: 11px;
  color: rgba(191, 192, 209, 0.7);
  text-transform: uppercase;
  letter-spacing: 1px;
}

.field input {
  width: 100%;
  background: rgba(30, 32, 44, 0.75);
  border: 1px solid rgba(191, 192, 209, 0.12);
  color: #f1f1f7;
  padding: 10px 14px;
  border-radius: 14px;
  font-size: 13px;
  margin-top: 6px;
  outline: none;
}

.field input:focus {
  border-color: rgba(96, 81, 155, 0.7);
  box-shadow: 0 0 0 2px rgba(96, 81, 155, 0.25);
}

.cta {
  display: flex;
  justify-content: center;
  gap: 12px;
  margin-bottom: 12px;
}

.primary {
  background: linear-gradient(135deg, #60519b, #b276ff);
  border: none;
  color: #f1f1f7;
  padding: 10px 22px;
  border-radius: 999px;
  font-size: 12px;
  cursor: pointer;
  box-shadow: 0 12px 24px rgba(96, 81, 155, 0.35);
}

.ghost {
  background: transparent;
  border: 1px solid rgba(191, 192, 209, 0.3);
  color: #bfc0d1;
  padding: 10px 20px;
  border-radius: 999px;
  font-size: 12px;
  cursor: pointer;
}

.hint {
  font-size: 11px;
  color: rgba(191, 192, 209, 0.6);
}

@media (max-width: 600px) {
  .glass-card {
    border-radius: 90px 90px 26px 26px;
    padding: 28px 22px 22px;
  }
}
</style>
