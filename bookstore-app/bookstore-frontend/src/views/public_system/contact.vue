<template>
  <div class="contact">
    <div class="glass">
      <h1>KEEP PUSHING FORWARD!</h1>
      <p>it's as easy as turning on a light</p>
      <div class="actions">
        <button class="primary">Send Message</button>
        <button class="ghost">Contact Support</button>
      </div>
    </div>
    <div class="orbs">
      <span class="orb large"></span>
      <span class="orb medium"></span>
      <span class="orb small"></span>
      <span class="orb tiny"></span>
    </div>
  </div>
</template>

<script setup></script>

<style scoped>
.contact {
  min-height: 100vh;
  background: radial-gradient(circle at top, #2b0307 0%, #19171b 55%, #51080d 100%);
  display: grid;
  place-items: center;
  position: relative;
  overflow: hidden;
  color: #fff;
}

.glass {
  padding: 60px 72px;
  border-radius: 24px;
  background: rgba(255, 255, 255, 0.12);
  border: 1px solid rgba(255, 255, 255, 0.2);
  backdrop-filter: blur(16px);
  text-align: center;
  box-shadow: 0 30px 60px rgba(0, 0, 0, 0.35);
  z-index: 2;
}

.glass h1 {
  font-size: 36px;
  letter-spacing: 1px;
}

.actions {
  margin-top: 24px;
  display: flex;
  gap: 12px;
  justify-content: center;
}

.primary {
  background: linear-gradient(135deg, #75020f, #51080d);
  color: #fff;
  border: none;
  padding: 10px 20px;
  border-radius: 999px;
}

.ghost {
  background: transparent;
  border: 1px solid rgba(255, 255, 255, 0.3);
  color: #fff;
  padding: 10px 20px;
  border-radius: 999px;
}

.orbs .orb {
  position: absolute;
  border-radius: 50%;
  background: radial-gradient(circle at 30% 30%, #fff, rgba(255, 255, 255, 0.1));
  box-shadow: 0 20px 40px rgba(0, 0, 0, 0.3);
}

.orb.large {
  width: 260px;
  height: 260px;
  top: 10%;
  left: 20%;
  background: radial-gradient(circle at 30% 30%, #f3f4f6, #75020f 60%);
}

.orb.medium {
  width: 200px;
  height: 200px;
  bottom: 15%;
  right: 18%;
  background: radial-gradient(circle at 30% 30%, #f3f4f6, #51080d 70%);
}

.orb.small {
  width: 120px;
  height: 120px;
  top: 18%;
  right: 30%;
}

.orb.tiny {
  width: 80px;
  height: 80px;
  bottom: 18%;
  left: 32%;
}
</style>
