<template>
  <div class="page">
    <div class="hero">
      <div class="glow orb-1"></div>
      <div class="glow orb-2"></div>
      <div class="glass-panel">
        <div class="card-visual">
          <div class="card-chip"></div>
          <div class="card-meta">
            <span class="card-title">Balance</span>
            <span class="card-amount">$ 171,234.54</span>
          </div>
          <div class="card-number">1753 9021 3512 2499</div>
          <div class="card-footer">
            <span class="card-holder">MARCIN PANKIEWICZ 24/01</span>
            <span class="card-logo"></span>
          </div>
        </div>
        <div class="hero-text">
          <h1>Link Your Bank Card</h1>
          <p>
            Collaborate seamlessly with your finances — link a card to manage
            purchases, refunds, and secure payouts in one place.
          </p>
          <div class="progress">
            <span class="dot active"></span>
            <span class="dot"></span>
            <span class="dot"></span>
          </div>
        </div>
      </div>
    </div>

    <div class="content">
      <div class="section-title">
        <h2>Card details</h2>
        <span>Securely connect your bank card</span>
      </div>

      <form class="card-form">
        <div class="field">
          <label>Card holder name</label>
          <input type="text" placeholder="Enter your name" />
        </div>
        <div class="field">
          <label>Card number</label>
          <input type="text" placeholder="XXXX XXXX XXXX XXXX" />
        </div>
        <div class="row">
          <div class="field">
            <label>Expiry</label>
            <input type="text" placeholder="MM/YY" />
          </div>
          <div class="field">
            <label>CVV</label>
            <input type="password" placeholder="***" />
          </div>
        </div>
        <div class="field">
          <label>Billing address</label>
          <input type="text" placeholder="Street, city, country" />
        </div>
        <button type="button" class="primary-btn">Link card</button>
      </form>
    </div>
  </div>
</template>

<script setup></script>

<style scoped>
:root {
  color-scheme: dark;
}

.page {
  min-height: 100vh;
  background: radial-gradient(1200px 600px at 10% -10%, #60519b33, transparent),
    radial-gradient(900px 600px at 90% 10%, #bfc0d11f, transparent),
    #1e202c;
  color: #bfc0d1;
  padding: 48px 24px 72px;
  font-family: "Inter", "Segoe UI", system-ui, -apple-system, sans-serif;
}

.hero {
  position: relative;
  display: flex;
  justify-content: center;
  margin-bottom: 56px;
}

.glass-panel {
  position: relative;
  width: min(960px, 100%);
  padding: 40px 32px;
  border-radius: 28px;
  background: linear-gradient(135deg, #31323ea6, #1e202ce6);
  border: 1px solid #31323e;
  box-shadow: 0 30px 60px rgba(0, 0, 0, 0.45);
  display: grid;
  grid-template-columns: minmax(260px, 320px) 1fr;
  gap: 32px;
  overflow: hidden;
}

.glow {
  position: absolute;
  border-radius: 50%;
  filter: blur(60px);
  opacity: 0.55;
}

.orb-1 {
  width: 260px;
  height: 260px;
  background: radial-gradient(circle, #60519b, transparent 70%);
  left: 8%;
  top: -60px;
}

.orb-2 {
  width: 300px;
  height: 300px;
  background: radial-gradient(circle, #bfc0d1, transparent 70%);
  right: 6%;
  top: 60px;
}

.card-visual {
  position: relative;
  padding: 26px;
  border-radius: 20px;
  background: linear-gradient(135deg, #1e202c, #31323e);
  box-shadow: 0 16px 40px rgba(0, 0, 0, 0.4);
  border: 1px solid #31323e;
  display: flex;
  flex-direction: column;
  gap: 18px;
}

.card-chip {
  width: 42px;
  height: 32px;
  border-radius: 8px;
  background: linear-gradient(135deg, #bfc0d1, #60519b);
  box-shadow: inset 0 0 12px rgba(0, 0, 0, 0.25);
}

.card-meta {
  display: flex;
  flex-direction: column;
  gap: 6px;
  color: #bfc0d1;
}

.card-title {
  font-size: 12px;
  letter-spacing: 0.08em;
  text-transform: uppercase;
  opacity: 0.7;
}

.card-amount {
  font-size: 24px;
  color: #ffffff;
}

.card-number {
  font-size: 16px;
  letter-spacing: 0.12em;
  color: #bfc0d1;
}

.card-footer {
  display: flex;
  align-items: center;
  justify-content: space-between;
  font-size: 12px;
  color: #bfc0d1;
}

.card-logo {
  width: 42px;
  height: 24px;
  border-radius: 12px;
  background: linear-gradient(120deg, #60519b, #bfc0d1);
  position: relative;
}

.card-logo::after {
  content: "";
  position: absolute;
  right: 8px;
  top: 6px;
  width: 12px;
  height: 12px;
  border-radius: 50%;
  background: #1e202c;
  opacity: 0.7;
}

.hero-text h1 {
  margin: 0 0 12px;
  font-size: 32px;
  color: #ffffff;
}

.hero-text p {
  margin: 0 0 18px;
  color: #bfc0d1;
  line-height: 1.6;
}

.progress {
  display: flex;
  gap: 8px;
}

.dot {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  background: #31323e;
}

.dot.active {
  background: linear-gradient(120deg, #60519b, #bfc0d1);
  box-shadow: 0 0 12px #60519b66;
}

.content {
  max-width: 960px;
  margin: 0 auto;
}

.section-title {
  margin-bottom: 24px;
}

.section-title h2 {
  margin: 0 0 6px;
  color: #ffffff;
}

.section-title span {
  color: #bfc0d1;
  opacity: 0.7;
}

.card-form {
  background: linear-gradient(135deg, #1e202c, #31323e);
  border: 1px solid #31323e;
  padding: 28px;
  border-radius: 20px;
  display: grid;
  gap: 20px;
  box-shadow: 0 20px 50px rgba(0, 0, 0, 0.35);
}

.field {
  display: flex;
  flex-direction: column;
  gap: 8px;
}

label {
  font-size: 13px;
  text-transform: uppercase;
  letter-spacing: 0.12em;
  color: #bfc0d1;
  opacity: 0.7;
}

input {
  background: #1e202c;
  border: 1px solid #31323e;
  border-radius: 12px;
  padding: 12px 14px;
  color: #ffffff;
  font-size: 14px;
  outline: none;
  transition: border-color 0.2s ease, box-shadow 0.2s ease;
}

input:focus {
  border-color: #60519b;
  box-shadow: 0 0 0 3px #60519b33;
}

.row {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 20px;
}

.primary-btn {
  margin-top: 8px;
  background: linear-gradient(120deg, #60519b, #bfc0d1);
  color: #1e202c;
  padding: 14px 18px;
  border: none;
  border-radius: 14px;
  font-weight: 600;
  cursor: pointer;
  transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.primary-btn:hover {
  transform: translateY(-1px);
  box-shadow: 0 12px 24px rgba(96, 81, 155, 0.35);
}

@media (max-width: 900px) {
  .glass-panel {
    grid-template-columns: 1fr;
  }

  .card-visual {
    max-width: 320px;
    margin: 0 auto;
  }
}

@media (max-width: 640px) {
  .row {
    grid-template-columns: 1fr;
  }

  .page {
    padding: 32px 16px 56px;
  }
}
</style>
