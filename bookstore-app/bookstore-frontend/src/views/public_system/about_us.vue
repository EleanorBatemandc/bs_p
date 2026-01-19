<template>
  <div class="about">
    <header class="nav">
      <div class="logo">Serenystem</div>
      <nav>
        <a>Destiny</a>
        <a>Strategy</a>
        <a>Services</a>
        <a>About</a>
        <a>Roadmap</a>
      </nav>
    </header>

    <section class="hero">
      <div class="hero-text">
        <h1>Dearphey of the Unthaeyprse</h1>
        <p>
          Building a cosmos of stories and knowledge. Our bookstore connects readers with
          immersive experiences and curated selections.
        </p>
        <button>Voice More</button>
      </div>
      <div class="planet">
        <div class="orbit"></div>
        <div class="planet-core"></div>
        <div class="moon"></div>
      </div>
    </section>

    <section class="features">
      <div class="feature">
        <h3>The Narrative of the Oeparey</h3>
        <p>We organize knowledge into accessible pathways and captivating adventures.</p>
      </div>
      <div class="feature">
        <h3>Cker Nnrintpnes</h3>
        <p>Community-driven recommendations powered by data and intuition.</p>
      </div>
      <div class="feature">
        <h3>Hoatost Eherofhnbegs</h3>
        <p>Deep analytics for reading trends, inventory and forecasting.</p>
      </div>
    </section>

    <section class="cards">
      <div class="card" v-for="planet in planets" :key="planet.title">
        <h4>{{ planet.title }}</h4>
        <p>{{ planet.desc }}</p>
      </div>
    </section>
  </div>
</template>

<script setup>
const planets = [
  { title: 'CEMCIRE', desc: 'Curated collections and seasonal highlights.' },
  { title: 'VE ? ORESS', desc: 'Reader profiles and tailored discovery.' },
  { title: 'KURVIANURLS', desc: 'Community events and author talks.' },
  { title: 'PEDTFCT KER', desc: 'Insights for retail and distribution.' }
]
</script>

<style scoped>
.about {
  min-height: 100vh;
  padding: 32px 48px 60px;
  background: radial-gradient(circle at top left, #2b0307, #19171b 55%, #51080d 100%);
  color: #e5e7eb;
}

.nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.nav nav {
  display: flex;
  gap: 18px;
  color: #d1d5db;
  font-size: 14px;
}

.hero {
  display: grid;
  grid-template-columns: 1.2fr 1fr;
  gap: 40px;
  margin-top: 60px;
  align-items: center;
}

.hero h1 {
  font-size: 42px;
  margin-bottom: 12px;
}

.hero button {
  margin-top: 16px;
  padding: 10px 20px;
  border-radius: 999px;
  border: none;
  background: linear-gradient(135deg, #75020f, #51080d);
  color: #fff;
}

.planet {
  position: relative;
  width: 320px;
  height: 320px;
  margin: 0 auto;
}

.planet-core {
  width: 220px;
  height: 220px;
  border-radius: 50%;
  background: radial-gradient(circle at 30% 30%, #f9fafb, #75020f 60%, #2b0307 100%);
  box-shadow: 0 0 60px rgba(117, 2, 15, 0.7);
  margin: 0 auto;
}

.orbit {
  position: absolute;
  inset: 20px;
  border-radius: 50%;
  border: 1px dashed rgba(255, 255, 255, 0.2);
}

.moon {
  position: absolute;
  top: 20px;
  right: 40px;
  width: 44px;
  height: 44px;
  border-radius: 50%;
  background: #f8fafc;
  box-shadow: 0 0 20px rgba(255, 255, 255, 0.3);
}

.features {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
  gap: 18px;
  margin: 48px 0 32px;
}

.feature {
  padding: 18px;
  background: rgba(255, 255, 255, 0.06);
  border-radius: 14px;
}

.cards {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
  gap: 18px;
}

.card {
  background: rgba(255, 255, 255, 0.08);
  padding: 18px;
  border-radius: 16px;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.08);
}
</style>
