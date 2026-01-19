<template>
  <div class="auth-page">
    <div class="auth-card">
      <div class="visual">
        <div class="brand">BS</div>
        <h2>Capturing Moments,<br />Creating Memories</h2>
        <div class="dots">
          <span></span>
          <span></span>
          <span></span>
        </div>
      </div>

      <div class="form-panel">
        <div class="form-header">
          <h1>Analyst Staff Login</h1>
          <p>Need an account? <a href="#">Register</a></p>
        </div>

        <form class="form">
          <div class="field-row">
            <label>
              Email or Username
              <input type="text" placeholder="analyst@bookstore.com" />
            </label>
          </div>
          <label>
            Password
            <input type="password" placeholder="Enter your password" />
          </label>
          <button class="primary" type="button">Log in</button>
        </form>

        <div class="divider"><span>Or login with</span></div>
        <div class="social">
          <button class="social-btn" type="button">Google</button>
          <button class="social-btn" type="button">Apple</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup></script>

<style scoped>
.auth-page {
  min-height: 100vh;
  display: grid;
  place-items: center;
  padding: 40px 16px;
  background: radial-gradient(circle at top left, #804A8A 0%, #3A0353 45%, #2c123b 100%);
  color: #f8fafc;
}

.auth-card {
  width: min(1100px, 95vw);
  min-height: 560px;
  display: grid;
  grid-template-columns: 1.1fr 1fr;
  background: rgba(255, 255, 255, 0.06);
  border-radius: 24px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  box-shadow: 0 30px 60px rgba(0, 0, 0, 0.35);
  overflow: hidden;
}

.visual {
  position: relative;
  padding: 32px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  background: linear-gradient(145deg, rgba(128, 74, 138, 0.95), rgba(58, 3, 83, 0.95));
}

.visual::after {
  content: '';
  position: absolute;
  inset: 16px;
  border-radius: 20px;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.08), rgba(255, 255, 255, 0));
  pointer-events: none;
}

.brand {
  width: 52px;
  height: 52px;
  border-radius: 14px;
  display: grid;
  place-items: center;
  font-weight: 700;
  background: rgba(255, 255, 255, 0.2);
  letter-spacing: 1px;
}

.visual h2 {
  margin: 0;
  font-size: 26px;
  line-height: 1.4;
  z-index: 1;
}

.dots {
  display: flex;
  gap: 8px;
  z-index: 1;
}

.dots span {
  width: 10px;
  height: 10px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.6);
}

.form-panel {
  padding: 36px 40px;
  display: flex;
  flex-direction: column;
  gap: 24px;
  background: rgba(34, 20, 53, 0.92);
}

.form-header h1 {
  margin: 0 0 8px;
  font-size: 28px;
}

.form-header p {
  margin: 0;
  color: #cbd5f5;
  font-size: 14px;
}

.form-header a {
  color: #f8d299;
  text-decoration: none;
}

.form {
  display: grid;
  gap: 16px;
}

.field-row {
  display: grid;
  gap: 12px;
}

label {
  display: grid;
  gap: 8px;
  font-size: 14px;
  color: #f8fafc;
}

input {
  padding: 12px 14px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.08);
  color: #fff;
}

.primary {
  margin-top: 8px;
  padding: 12px 16px;
  border-radius: 999px;
  border: none;
  color: #1f2937;
  background: linear-gradient(135deg, #F8D299, #F59E51);
  font-weight: 600;
  cursor: pointer;
}

.divider {
  position: relative;
  text-align: center;
  font-size: 12px;
  color: rgba(248, 250, 252, 0.6);
}

.divider::before,
.divider::after {
  content: '';
  position: absolute;
  top: 50%;
  width: 35%;
  height: 1px;
  background: rgba(255, 255, 255, 0.18);
}

.divider::before {
  left: 0;
}

.divider::after {
  right: 0;
}

.social {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.social-btn {
  padding: 10px 12px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.05);
  color: #f8fafc;
  cursor: pointer;
}

@media (max-width: 900px) {
  .auth-card {
    grid-template-columns: 1fr;
  }

  .visual {
    min-height: 240px;
  }

  .form-panel {
    padding: 28px 24px 32px;
  }
}
</style>
