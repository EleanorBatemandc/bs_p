<template>
  <div class="home">
    <aside class="sidebar">
      <div class="logo">W</div>
      <nav>
        <button class="icon-btn">🏠</button>
        <button class="icon-btn">📚</button>
        <button class="icon-btn">⭐</button>
        <button class="icon-btn">⚙️</button>
      </nav>
    </aside>

    <section class="main">
      <header class="topbar">
        <div class="search">
          <span>🔍</span>
          <input placeholder="Search" />
        </div>
        <h1>My Books</h1>
        <div class="profile">
          <span class="chip">2.5k</span>
          <img class="avatar" alt="user" src="https://images.unsplash.com/photo-1544723795-3fb6469f5b39?q=80&w=120&auto=format&fit=crop" />
        </div>
      </header>

      <div class="quick-links">
        <RouterLink class="quick-btn" to="/public/service">Service</RouterLink>
        <RouterLink class="quick-btn" to="/public/about-us">About Us</RouterLink>
        <RouterLink class="quick-btn" to="/public/contact">Contact</RouterLink>
        <RouterLink class="quick-btn accent" to="/auth/welcome">Welcome</RouterLink>
      </div>

      <div class="shelf">
        <div class="book-card" v-for="book in topBooks" :key="book.title">
          <img :src="book.cover" :alt="book.title" />
          <p>{{ book.title }}</p>
        </div>
      </div>

      <div class="panels">
        <div class="panel best">
          <div class="panel-header">
            <h2>Best Book</h2>
            <span>view more</span>
          </div>
          <div class="best-body">
            <img src="https://images.unsplash.com/photo-1528207776546-365bb710ee93?q=80&w=240&auto=format&fit=crop" alt="best" />
            <div>
              <h3>The Problem with Forever</h3>
              <p>
                An unforgettable story about love and healing. Experience immersive reading
                with a calm, minimalist interface.
              </p>
              <button class="cta">Read More</button>
            </div>
          </div>
        </div>
        <div class="panel popular">
          <div class="panel-header">
            <h2>Popular</h2>
            <span>all books</span>
          </div>
          <div class="popular-grid">
            <div class="popular-item" v-for="book in popularBooks" :key="book.title">
              <img :src="book.cover" :alt="book.title" />
              <div>
                <strong>{{ book.title }}</strong>
                <p>{{ book.author }}</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script setup>
const topBooks = [
  { title: 'Tainted Rose', cover: 'https://images.unsplash.com/photo-1512820790803-83ca734da794?q=80&w=200&auto=format&fit=crop' },
  { title: 'The Siren', cover: 'https://images.unsplash.com/photo-1524995997946-a1c2e315a42f?q=80&w=200&auto=format&fit=crop' },
  { title: 'Hushed', cover: 'https://images.unsplash.com/photo-1519681393784-d120267933ba?q=80&w=200&auto=format&fit=crop' },
  { title: 'Jagged', cover: 'https://images.unsplash.com/photo-1512820790803-83ca734da794?q=80&w=200&auto=format&fit=crop' },
  { title: 'Sun is a Star', cover: 'https://images.unsplash.com/photo-1528207776546-365bb710ee93?q=80&w=200&auto=format&fit=crop' }
]

const popularBooks = [
  { title: 'Dating You', author: 'Christina', cover: 'https://images.unsplash.com/photo-1528207776546-365bb710ee93?q=80&w=120&auto=format&fit=crop' },
  { title: '100 Secrets', author: 'Jessica', cover: 'https://images.unsplash.com/photo-1524995997946-a1c2e315a42f?q=80&w=120&auto=format&fit=crop' },
  { title: 'The Gem', author: 'Keira', cover: 'https://images.unsplash.com/photo-1519681393784-d120267933ba?q=80&w=120&auto=format&fit=crop' },
  { title: 'Yours', author: 'Anna', cover: 'https://images.unsplash.com/photo-1512820790803-83ca734da794?q=80&w=120&auto=format&fit=crop' }
]
</script>

<style scoped>
:root {
  color-scheme: dark;
}

.home {
  display: grid;
  grid-template-columns: 90px 1fr;
  min-height: 100vh;
  background: radial-gradient(circle at top left, #2b0307, #19171b 45%, #51080d 100%);
  color: #f8fafc;
}

.sidebar {
  background: rgba(25, 23, 27, 0.9);
  padding: 24px 16px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 32px;
  border-right: 1px solid rgba(255, 255, 255, 0.08);
}

.logo {
  width: 42px;
  height: 42px;
  border-radius: 12px;
  display: grid;
  place-items: center;
  font-weight: 700;
  background: linear-gradient(135deg, #75020f, #2b0307);
}

.sidebar nav {
  display: flex;
  flex-direction: column;
  gap: 16px;
}

.icon-btn {
  width: 44px;
  height: 44px;
  border-radius: 14px;
  border: none;
  background: rgba(255, 255, 255, 0.06);
  color: #f8fafc;
  font-size: 18px;
}

.main {
  padding: 28px 36px 40px;
}

.topbar {
  display: grid;
  grid-template-columns: 240px 1fr 180px;
  align-items: center;
  gap: 16px;
}

.quick-links {
  margin: 18px 0 4px;
  display: flex;
  gap: 12px;
}

.quick-btn {
  padding: 8px 14px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(117, 2, 15, 0.35);
  color: #fff;
  text-decoration: none;
  font-size: 14px;
  transition: all 0.2s ease;
}

.quick-btn.accent {
  background: linear-gradient(135deg, #75020f, #51080d);
  border-color: transparent;
}

.quick-btn:hover {
  background: linear-gradient(135deg, #75020f, #51080d);
  border-color: transparent;
}

.search {
  display: flex;
  align-items: center;
  gap: 8px;
  background: rgba(255, 255, 255, 0.08);
  padding: 10px 14px;
  border-radius: 12px;
}

.search input {
  background: transparent;
  border: none;
  color: #fff;
  outline: none;
  width: 100%;
}

.profile {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  gap: 10px;
}

.chip {
  padding: 6px 10px;
  border-radius: 999px;
  background: rgba(117, 2, 15, 0.6);
  font-size: 12px;
}

.avatar {
  width: 34px;
  height: 34px;
  border-radius: 50%;
  object-fit: cover;
}

.shelf {
  margin: 28px 0 24px;
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(140px, 1fr));
  gap: 16px;
}

.book-card {
  background: rgba(255, 255, 255, 0.08);
  padding: 12px;
  border-radius: 16px;
  text-align: center;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.06);
}

.book-card img {
  width: 100%;
  height: 150px;
  object-fit: cover;
  border-radius: 12px;
  margin-bottom: 8px;
}

.panels {
  display: grid;
  grid-template-columns: 1.1fr 1fr;
  gap: 20px;
}

.panel {
  background: rgba(255, 255, 255, 0.06);
  border-radius: 20px;
  padding: 18px;
  box-shadow: 0 18px 40px rgba(0, 0, 0, 0.2);
}

.panel-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.best-body {
  display: grid;
  grid-template-columns: 160px 1fr;
  gap: 16px;
  margin-top: 16px;
}

.best-body img {
  width: 100%;
  border-radius: 16px;
}

.cta {
  margin-top: 12px;
  padding: 10px 18px;
  border-radius: 12px;
  border: none;
  background: linear-gradient(135deg, #75020f, #51080d);
  color: #fff;
}

.popular-grid {
  display: grid;
  gap: 12px;
  margin-top: 16px;
}

.popular-item {
  display: grid;
  grid-template-columns: 54px 1fr;
  gap: 12px;
  align-items: center;
}

.popular-item img {
  width: 54px;
  height: 70px;
  border-radius: 10px;
  object-fit: cover;
}
</style>
