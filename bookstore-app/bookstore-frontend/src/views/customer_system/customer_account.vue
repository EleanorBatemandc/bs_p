<template>
  <div class="page">
    <div class="topbar">
      <div class="brand">
        <span class="logo-dot"></span>
        <span class="brand-text">BookNest</span>
      </div>
      <div class="top-actions">
        <button class="pill">Upgrade</button>
        <div class="icon-badge">7</div>
        <div class="avatar"></div>
      </div>
    </div>

    <div class="hero">
      <div class="hero-card">
        <div class="hero-header">
          <h1>Customer Account</h1>
          <span class="status">Premium</span>
        </div>
        <p class="subtitle">Track your profile, orders, and rewards in one place.</p>
        <div class="profile">
          <div class="profile-avatar"></div>
          <div class="profile-meta">
            <div class="name">{{ fullName }}</div>
            <div class="meta">{{ profile.email || 'email@booknest.io' }}</div>
          </div>
        </div>
        <div class="stats">
          <div class="stat">
            <div class="stat-value">128</div>
            <div class="stat-label">Books Owned</div>
          </div>
          <div class="stat">
            <div class="stat-value">24</div>
            <div class="stat-label">Wishlisted</div>
          </div>
          <div class="stat">
            <div class="stat-value">$1,248</div>
            <div class="stat-label">Lifetime Spend</div>
          </div>
        </div>
        <div class="progress">
          <div class="progress-label">
            <span>XP Progress</span>
            <span>68%</span>
          </div>
          <div class="progress-track">
            <div class="progress-bar"></div>
          </div>
        </div>
      </div>

      <div class="hero-side">
        <div class="card chart-card">
          <div class="card-title">Reading Habit</div>
          <div class="mini-chart">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <span></span>
          </div>
          <div class="chart-footer">
            <div>
              <div class="chart-label">Daily Avg</div>
              <div class="chart-value">1.7 hrs</div>
            </div>
            <div>
              <div class="chart-label">Streak</div>
              <div class="chart-value">23 days</div>
            </div>
          </div>
        </div>

        <div class="card reward-card">
          <div class="reward-ring">
            <div class="reward-inner">
              <div class="reward-title">XP</div>
              <div class="reward-value">68%</div>
            </div>
          </div>
          <div class="reward-text">
            Next reward unlocks at 80%.
          </div>
          <button class="pill ghost">View Rewards</button>
        </div>
      </div>
    </div>

    <div class="grid">
      <div class="card">
        <div class="card-title">Skill Tracker</div>
        <ul class="list">
          <li>
            <span>Literature</span>
            <div class="chip">Advanced</div>
          </li>
          <li>
            <span>Science</span>
            <div class="chip">Intermediate</div>
          </li>
          <li>
            <span>Business</span>
            <div class="chip">Beginner</div>
          </li>
          <li>
            <span>Art & Design</span>
            <div class="chip">Advanced</div>
          </li>
        </ul>
      </div>

      <div class="card">
        <div class="card-title">Recent Orders</div>
        <div class="order">
          <div class="order-left">
            <div class="order-icon"></div>
            <div>
              <div class="order-name">The Violet Archive</div>
              <div class="order-meta">#BK-2219 · Delivered</div>
            </div>
          </div>
          <div class="order-price">$32</div>
        </div>
        <div class="order">
          <div class="order-left">
            <div class="order-icon"></div>
            <div>
              <div class="order-name">Midnight Systems</div>
              <div class="order-meta">#BK-2188 · Processing</div>
            </div>
          </div>
          <div class="order-price">$41</div>
        </div>
        <div class="order">
          <div class="order-left">
            <div class="order-icon"></div>
            <div>
              <div class="order-name">The Glass Library</div>
              <div class="order-meta">#BK-2143 · Delivered</div>
            </div>
          </div>
          <div class="order-price">$27</div>
        </div>
      </div>

      <div class="card">
        <div class="card-title">Customer Details</div>
        <ul class="list">
          <li>
            <span>Age</span>
            <div class="chip">{{ profile.age || '—' }}</div>
          </li>
          <li>
            <span>Nationality</span>
            <div class="chip">{{ profile.nationality || '—' }}</div>
          </li>
          <li>
            <span>Language</span>
            <div class="chip">{{ profile.language || '—' }}</div>
          </li>
          <li>
            <span>Profession</span>
            <div class="chip">{{ profile.profession || '—' }}</div>
          </li>
        </ul>
      </div>

      <div class="card marketplace">
        <div class="card-title">Marketplace</div>
        <div class="market-item">
          <div class="market-left">
            <span class="market-icon"></span>
            <div>
              <div class="market-name">Goal Collections</div>
              <div class="market-meta">Curated bundles</div>
            </div>
          </div>
          <div class="market-value">85%</div>
        </div>
        <div class="market-item">
          <div class="market-left">
            <span class="market-icon"></span>
            <div>
              <div class="market-name">Black Shelf</div>
              <div class="market-meta">Limited editions</div>
            </div>
          </div>
          <div class="market-value">72%</div>
        </div>
        <div class="market-item">
          <div class="market-left">
            <span class="market-icon"></span>
            <div>
              <div class="market-name">Prime Picks</div>
              <div class="market-meta">Weekly highlights</div>
            </div>
          </div>
          <div class="market-value">91%</div>
        </div>
      </div>

      <div class="card actions">
        <div class="card-title">Quick Actions</div>
        <div class="action-grid">
          <router-link class="action" to="/customer/edit">Edit Profile</router-link>
          <router-link class="action" to="/customer/link-bank-card">Manage Cards</router-link>
          <router-link class="action" to="/books/order">My Orders</router-link>
          <button class="action" type="button">Support</button>
          <router-link class="action" to="/customer/account">Account Overview</router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { computed, reactive, onMounted } from 'vue'

const profile = reactive({
  firstName: 'Nora',
  lastName: 'Sythe',
  email: 'nora@booknest.io',
  age: '',
  nationality: '',
  language: '',
  profession: ''
})

const fullName = computed(() => `${profile.firstName} ${profile.lastName}`.trim())

onMounted(() => {
  const cached = localStorage.getItem('customerProfile')
  if (!cached) return
  try {
    const parsed = JSON.parse(cached)
    Object.assign(profile, parsed)
  } catch {
    localStorage.removeItem('customerProfile')
  }
})
</script>

<style scoped>
:global(body) {
  background: #1e202c;
}

.page {
  min-height: 100vh;
  padding: 32px 28px 48px;
  color: #bfc0d1;
  background: radial-gradient(circle at top, rgba(96, 81, 155, 0.35), transparent 40%),
    linear-gradient(180deg, #1e202c 0%, #15151f 100%);
  font-family: "Inter", "Segoe UI", system-ui, sans-serif;
}

.topbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 28px;
}

.brand {
  display: inline-flex;
  align-items: center;
  gap: 10px;
  font-weight: 600;
  letter-spacing: 0.6px;
  color: #bfc0d1;
}

.logo-dot {
  width: 14px;
  height: 14px;
  border-radius: 50%;
  background: linear-gradient(135deg, #60519b, #b276ff);
  box-shadow: 0 0 12px rgba(96, 81, 155, 0.8);
}

.brand-text {
  font-size: 16px;
}

.top-actions {
  display: flex;
  align-items: center;
  gap: 14px;
}

.pill {
  background: linear-gradient(135deg, #60519b, #8c6dfc);
  border: none;
  color: #f2f2f8;
  padding: 8px 18px;
  border-radius: 999px;
  font-size: 12px;
  cursor: pointer;
  box-shadow: 0 12px 24px rgba(96, 81, 155, 0.35);
}

.pill.ghost {
  background: transparent;
  border: 1px solid rgba(191, 192, 209, 0.25);
  box-shadow: none;
}

.icon-badge {
  background: #31323e;
  color: #bfc0d1;
  padding: 6px 10px;
  border-radius: 12px;
  font-size: 12px;
  border: 1px solid rgba(191, 192, 209, 0.1);
}

.avatar {
  width: 34px;
  height: 34px;
  border-radius: 50%;
  background: linear-gradient(135deg, #60519b, #bfc0d1);
  border: 2px solid rgba(191, 192, 209, 0.3);
}

.hero {
  display: grid;
  grid-template-columns: 2fr 1fr;
  gap: 22px;
  margin-bottom: 26px;
}

.hero-card {
  background: #232434;
  border-radius: 22px;
  padding: 26px;
  border: 1px solid rgba(191, 192, 209, 0.08);
  box-shadow: 0 24px 60px rgba(6, 6, 15, 0.6);
}

.hero-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 8px;
}

.hero-header h1 {
  margin: 0;
  font-size: 24px;
  color: #f1f1f7;
}

.status {
  padding: 6px 12px;
  border-radius: 12px;
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 1px;
  background: rgba(96, 81, 155, 0.25);
  color: #bfc0d1;
  border: 1px solid rgba(96, 81, 155, 0.4);
}

.subtitle {
  margin: 0 0 20px;
  color: rgba(191, 192, 209, 0.7);
}

.profile {
  display: flex;
  align-items: center;
  gap: 18px;
  margin-bottom: 20px;
}

.profile-avatar {
  width: 64px;
  height: 64px;
  border-radius: 50%;
  background: radial-gradient(circle at top, #bfc0d1, #60519b 70%);
  box-shadow: 0 10px 20px rgba(96, 81, 155, 0.4);
}

.name {
  font-size: 18px;
  font-weight: 600;
  color: #f1f1f7;
}

.meta {
  font-size: 12px;
  color: rgba(191, 192, 209, 0.65);
}

.stats {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 12px;
  margin-bottom: 18px;
}

.stat {
  background: #1e202c;
  border-radius: 16px;
  padding: 14px 12px;
  border: 1px solid rgba(191, 192, 209, 0.08);
}

.stat-value {
  font-size: 18px;
  color: #f1f1f7;
  font-weight: 600;
}

.stat-label {
  font-size: 11px;
  color: rgba(191, 192, 209, 0.7);
}

.progress-label {
  display: flex;
  justify-content: space-between;
  font-size: 12px;
  margin-bottom: 8px;
  color: rgba(191, 192, 209, 0.7);
}

.progress-track {
  height: 10px;
  border-radius: 999px;
  background: #1e202c;
  overflow: hidden;
  border: 1px solid rgba(191, 192, 209, 0.08);
}

.progress-bar {
  height: 100%;
  width: 68%;
  border-radius: 999px;
  background: linear-gradient(90deg, #60519b, #b276ff, #bfc0d1);
  box-shadow: 0 0 12px rgba(96, 81, 155, 0.8);
}

.hero-side {
  display: grid;
  gap: 18px;
}

.card {
  background: #232434;
  border-radius: 20px;
  padding: 18px;
  border: 1px solid rgba(191, 192, 209, 0.08);
  box-shadow: 0 18px 40px rgba(10, 10, 20, 0.5);
}

.card-title {
  font-size: 14px;
  font-weight: 600;
  margin-bottom: 16px;
  color: #f1f1f7;
}

.chart-card .mini-chart {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  gap: 8px;
  height: 90px;
  align-items: end;
  margin-bottom: 16px;
}

.chart-card .mini-chart span {
  display: block;
  background: linear-gradient(180deg, #60519b, #b276ff);
  border-radius: 10px 10px 4px 4px;
  box-shadow: inset 0 0 12px rgba(191, 192, 209, 0.2);
}

.chart-card .mini-chart span:nth-child(1) {
  height: 30%;
}

.chart-card .mini-chart span:nth-child(2) {
  height: 55%;
}

.chart-card .mini-chart span:nth-child(3) {
  height: 70%;
}

.chart-card .mini-chart span:nth-child(4) {
  height: 85%;
}

.chart-card .mini-chart span:nth-child(5) {
  height: 60%;
}

.chart-footer {
  display: flex;
  justify-content: space-between;
  font-size: 12px;
  color: rgba(191, 192, 209, 0.7);
}

.chart-value {
  font-size: 14px;
  color: #f1f1f7;
  font-weight: 600;
}

.reward-card {
  display: grid;
  justify-items: center;
  gap: 14px;
  text-align: center;
}

.reward-ring {
  width: 120px;
  height: 120px;
  border-radius: 50%;
  background: conic-gradient(#b276ff 0 68%, #1e202c 0 100%);
  display: grid;
  place-items: center;
}

.reward-inner {
  width: 86px;
  height: 86px;
  border-radius: 50%;
  background: #232434;
  display: grid;
  place-items: center;
  color: #f1f1f7;
}

.reward-title {
  font-size: 12px;
  color: rgba(191, 192, 209, 0.7);
}

.reward-value {
  font-size: 20px;
  font-weight: 700;
}

.reward-text {
  font-size: 12px;
  color: rgba(191, 192, 209, 0.7);
}

.grid {
  display: grid;
  grid-template-columns: repeat(4, minmax(0, 1fr));
  gap: 18px;
}

.list {
  list-style: none;
  padding: 0;
  margin: 0;
  display: grid;
  gap: 12px;
}

.list li {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px 12px;
  background: #1e202c;
  border-radius: 14px;
  border: 1px solid rgba(191, 192, 209, 0.08);
}

.chip {
  font-size: 10px;
  padding: 4px 8px;
  border-radius: 10px;
  background: rgba(96, 81, 155, 0.25);
  color: #bfc0d1;
  border: 1px solid rgba(96, 81, 155, 0.4);
}

.order {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px 0;
  border-bottom: 1px solid rgba(191, 192, 209, 0.08);
}

.order:last-child {
  border-bottom: none;
}

.order-left {
  display: flex;
  gap: 12px;
  align-items: center;
}

.order-icon {
  width: 34px;
  height: 34px;
  border-radius: 12px;
  background: linear-gradient(135deg, #60519b, #b276ff);
}

.order-name {
  color: #f1f1f7;
  font-size: 13px;
}

.order-meta {
  font-size: 11px;
  color: rgba(191, 192, 209, 0.6);
}

.order-price {
  color: #f1f1f7;
  font-weight: 600;
}

.marketplace .market-item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px 0;
  border-bottom: 1px solid rgba(191, 192, 209, 0.08);
}

.marketplace .market-item:last-child {
  border-bottom: none;
}

.market-left {
  display: flex;
  gap: 10px;
  align-items: center;
}

.market-icon {
  width: 28px;
  height: 28px;
  border-radius: 10px;
  background: #31323e;
  position: relative;
}

.market-icon::after {
  content: "";
  position: absolute;
  inset: 6px;
  border-radius: 6px;
  background: linear-gradient(135deg, #60519b, #b276ff);
}

.market-name {
  font-size: 12px;
  color: #f1f1f7;
}

.market-meta {
  font-size: 11px;
  color: rgba(191, 192, 209, 0.6);
}

.market-value {
  font-size: 12px;
  color: #bfc0d1;
}

.actions .action-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.action {
  background: #1e202c;
  color: #bfc0d1;
  border: 1px solid rgba(191, 192, 209, 0.1);
  padding: 10px 12px;
  border-radius: 12px;
  cursor: pointer;
  font-size: 12px;
  text-decoration: none;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.action:hover {
  border-color: rgba(96, 81, 155, 0.6);
  color: #f1f1f7;
}

@media (max-width: 1200px) {
  .hero {
    grid-template-columns: 1fr;
  }

  .grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 768px) {
  .grid {
    grid-template-columns: 1fr;
  }

  .stats {
    grid-template-columns: 1fr;
  }

  .topbar {
    flex-direction: column;
    align-items: flex-start;
    gap: 16px;
  }
}
</style>
