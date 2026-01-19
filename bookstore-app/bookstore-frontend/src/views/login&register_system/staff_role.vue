<template>
  <div class="welcome">
    <div class="panel">
      <div class="left">
        <div class="brand">BS</div>
        <h1>Staff Roles</h1>
        <p>Select the staff track you belong to and continue to login or register.</p>
        <div class="tips">
          <span>Technical</span>
          <span>Service</span>
          <span>Analyst</span>
        </div>
      </div>

      <div class="right">
        <h2>Staff Options</h2>
        <div class="options">
          <section class="option-card">
            <div class="option-header">
              <h3>Technical Staff</h3>
              <p>Engineering, infrastructure, and system support.</p>
            </div>
            <div class="actions">
              <router-link class="primary link-btn" to="/auth/technical-staff-login">
                Technical Login
              </router-link>
              <router-link class="ghost link-btn" to="/auth/technical-staff-register">
                Technical Register
              </router-link>
            </div>
          </section>

          <section class="option-card">
            <div class="option-header">
              <h3>Service Staff</h3>
              <p>Customer support and service operations.</p>
            </div>
            <div class="actions">
              <router-link class="primary link-btn" to="/auth/service-staff-login">
                Service Login
              </router-link>
              <router-link class="ghost link-btn" to="/auth/service-staff-register">
                Service Register
              </router-link>
            </div>
          </section>

          <section class="option-card">
            <div class="option-header">
              <h3>Analyst Staff</h3>
              <p>Data insights, reports, and analytics.</p>
            </div>
            <div class="actions">
              <router-link class="primary link-btn" to="/auth/analyst-staff-login">
                Analyst Login
              </router-link>
              <router-link class="ghost link-btn" to="/auth/analyst-staff-register">
                Analyst Register
              </router-link>
            </div>
          </section>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup></script>

<style scoped>
.welcome {
  min-height: 100vh;
  display: grid;
  place-items: center;
  background: radial-gradient(circle at top left, #804A8A 0%, #3A0353 45%, #2c123b 100%);
  color: #f8fafc;
  padding: 40px;
}

.panel {
  width: min(1040px, 92vw);
  min-height: 480px;
  background: rgba(255, 255, 255, 0.06);
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 24px;
  display: grid;
  grid-template-columns: 1.2fr 1fr;
  gap: 24px;
  padding: 32px;
  box-shadow: 0 30px 60px rgba(0, 0, 0, 0.35);
  backdrop-filter: blur(18px);
}

.left {
  display: flex;
  flex-direction: column;
  gap: 16px;
}

.brand {
  width: 42px;
  height: 42px;
  border-radius: 12px;
  display: grid;
  place-items: center;
  background: linear-gradient(135deg, #804A8A, #3A0353);
  font-weight: 700;
}

.left h1 {
  font-size: 36px;
  margin: 0;
}

.left p {
  color: #e2e8f0;
  line-height: 1.6;
}

.tips {
  display: flex;
  gap: 10px;
  flex-wrap: wrap;
}

.tips span {
  font-size: 12px;
  padding: 6px 12px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.16);
  border: 1px solid rgba(255, 255, 255, 0.25);
}

.ghost {
  width: fit-content;
  padding: 10px 18px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  background: linear-gradient(135deg, #F8D299, #F59E51);
  color: #1f2937;
  font-weight: 600;
  transition: transform 0.2s ease, filter 0.2s ease, box-shadow 0.2s ease;
}

.link-btn {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  text-decoration: none;
}

.right {
  background: rgba(58, 3, 83, 0.55);
  border-radius: 18px;
  padding: 24px;
  display: flex;
  flex-direction: column;
  gap: 14px;
}

.options {
  display: grid;
  gap: 16px;
}

.option-card {
  padding: 16px;
  border-radius: 16px;
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.12);
  display: grid;
  gap: 12px;
}

.option-header h3 {
  margin: 0 0 6px;
  font-size: 18px;
}

.option-header p {
  margin: 0;
  color: #e2e8f0;
  font-size: 14px;
}

.actions {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.primary {
  margin-top: 6px;
  padding: 10px 16px;
  border-radius: 999px;
  border: none;
  color: #1f2937;
  background: linear-gradient(135deg, #F8D299, #F59E51);
  font-weight: 600;
  transition: transform 0.2s ease, filter 0.2s ease, box-shadow 0.2s ease;
}

.primary:hover,
.ghost:hover,
.primary:active,
.ghost:active {
  filter: brightness(0.92);
  box-shadow: 0 10px 24px rgba(245, 158, 81, 0.3);
  transform: translateY(-1px);
}

.actions .primary,
.actions .ghost {
  width: 100%;
  margin-top: 0;
}

@media (max-width: 860px) {
  .panel {
    grid-template-columns: 1fr;
  }

  .actions {
    grid-template-columns: 1fr;
  }
}
</style>
