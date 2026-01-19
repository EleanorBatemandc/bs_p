<template>
  <div class="service">
    <header class="hero">
      <div class="brand">Index</div>
      <nav>
        <a>Home</a>
        <a>All Pages</a>
        <a>Pricing</a>
        <a>Blog</a>
        <a>Contact</a>
      </nav>
      <button class="pill">Get this Template</button>
    </header>

    <section class="headline">
      <h1>Enhance Customer Experience</h1>
      <p>
        Experience superior customer support with our advanced AI SaaS platform, delivering
        exceptional service efficiency and satisfaction.
      </p>
      <div class="actions">
        <button class="primary">Get Template</button>
        <button class="ghost">Learn More</button>
      </div>
    </section>

    <section class="feature-grid">
      <div class="feature highlight">
        <h3>AI Tailored Just for You</h3>
        <p>
          Intelligent automation and analytics to personalize support and create delightful
          user experiences.
        </p>
      </div>
      <div class="feature">
        <h4>Reliable</h4>
        <p>Consistent performance with minimal errors and stable workflows.</p>
      </div>
      <div class="feature">
        <h4>Intuitive</h4>
        <p>User-friendly interfaces that simplify complex operations.</p>
      </div>
      <div class="feature">
        <h4>Efficient</h4>
        <p>Automated routines to accelerate service and reduce costs.</p>
      </div>
      <div class="feature">
        <h4>Accurate</h4>
        <p>Decision support built on precise, trusted data insights.</p>
      </div>
      <div class="feature">
        <h4>Adaptive</h4>
        <p>Continuously learning models that improve over time.</p>
      </div>
    </section>
  </div>
</template>

<script setup></script>

<style scoped>
.service {
  min-height: 100vh;
  padding: 28px 48px 60px;
  color: #f9fafb;
  background: radial-gradient(circle at top, #2b0307 0%, #19171b 45%, #51080d 100%);
}

.hero {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 16px;
}

.brand {
  font-weight: 700;
  letter-spacing: 1px;
}

nav {
  display: flex;
  gap: 18px;
  font-size: 14px;
  color: #d1d5db;
}

.pill {
  padding: 8px 16px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(117, 2, 15, 0.6);
  color: #fff;
}

.headline {
  margin: 72px auto 52px;
  text-align: center;
  max-width: 640px;
}

.headline h1 {
  font-size: 42px;
  margin-bottom: 12px;
}

.actions {
  display: flex;
  justify-content: center;
  gap: 12px;
  margin-top: 20px;
}

.primary {
  background: linear-gradient(135deg, #75020f, #51080d);
  color: #fff;
  border: none;
  padding: 10px 18px;
  border-radius: 999px;
}

.ghost {
  background: transparent;
  color: #fff;
  border: 1px solid rgba(255, 255, 255, 0.2);
  padding: 10px 18px;
  border-radius: 999px;
}

.feature-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
  gap: 20px;
}

.feature {
  background: rgba(255, 255, 255, 0.06);
  padding: 20px;
  border-radius: 16px;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.08);
}

.feature.highlight {
  grid-column: span 2;
  background: linear-gradient(135deg, rgba(117, 2, 15, 0.7), rgba(43, 3, 7, 0.7));
}
</style>
