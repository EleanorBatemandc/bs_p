<template>
  <div class="book-page">
    <header class="topbar">
      <div class="brand">
        <span class="logo">BS</span>
        <div>
          <h1>Bookoo</h1>
          <p>Find the next story you love</p>
        </div>
      </div>
      <div class="search">
        <input type="text" placeholder="Search for books, authors, tags..." />
        <button class="search-btn" type="button">Search</button>
      </div>
      <nav class="nav-links">
        <router-link to="/books/categories">Categories</router-link>
        <router-link to="/books/order">Orders</router-link>
        <router-link class="primary-link" to="/customer/account">Account</router-link>
      </nav>
    </header>

    <main class="layout">
      <aside class="filters">
        <h2>Filter Option</h2>
        <div class="filter-block">
          <h3>Editor Picks</h3>
          <ul>
            <li>Best Sellers</li>
            <li>Most Commented</li>
            <li>New Releases</li>
            <li>Award Winners</li>
          </ul>
        </div>
        <div class="filter-block">
          <h3>Shop by Category</h3>
          <div class="tags">
            <span>Art</span>
            <span>Science</span>
            <span>Design</span>
            <span>Engineering</span>
          </div>
        </div>
        <div class="filter-block">
          <h3>Price Range</h3>
          <div class="range">
            <span>$15</span>
            <div class="bar"><span></span></div>
            <span>$120</span>
          </div>
        </div>
        <button class="apply-btn" type="button">Refine Search</button>
      </aside>

      <section class="catalog">
        <div class="catalog-header">
          <div>
            <h2>Books</h2>
            <p>Showing {{ books.length }} curated titles</p>
          </div>
          <div class="sort">
            <span>Sort by</span>
            <button type="button">Popular</button>
          </div>
        </div>

        <div class="grid">
          <article
            v-for="book in books"
            :key="book.title"
            class="book-card"
            role="button"
            tabindex="0"
            @click="goToOrder"
            @keydown.enter="goToOrder"
          >
            <div class="cover">
              <img :src="book.image" :alt="book.title" />
              <span class="badge">{{ book.tag }}</span>
            </div>
            <div class="info">
              <h3>{{ book.title }}</h3>
              <p>{{ book.author }}</p>
              <div class="meta">
                <span class="price">${{ book.price }}</span>
                <span class="rating">★ {{ book.rating }}</span>
              </div>
              <router-link class="card-cta" to="/books/order">Order now</router-link>
            </div>
          </article>
        </div>

        <div class="sale-section">
          <div class="sale-header">
            <h2>Books on Sale</h2>
            <p>Limited-time offers with vibrant deals</p>
          </div>
          <div class="sale-grid">
            <article v-for="book in onSale" :key="book.title" class="sale-card">
              <img :src="book.image" :alt="book.title" />
              <div>
                <h4>{{ book.title }}</h4>
                <span class="sale-price">${{ book.price }}</span>
              </div>
              <span class="sale-badge">{{ book.discount }}% off</span>
            </article>
          </div>
        </div>

        <div class="newsletter">
          <div>
            <h2>Subscribe for updates</h2>
            <p>Get orange-hot releases and curated picks.</p>
          </div>
          <div class="newsletter-form">
            <input type="email" placeholder="Your email" />
            <button type="button">Subscribe</button>
          </div>
        </div>
      </section>
    </main>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
import cleanCode from '../../assets/images/Science/empirical_science/Clean Code, Robert C. Martin.jpeg'
import softwareEngineering from '../../assets/images/Science/empirical_science/Software Engineering, Ravi Sethi.jpeg'
import computerScience from '../../assets/images/Science/empirical_science/Computer Science, Allen B. Tucker.jpeg'
import mechatronics from '../../assets/images/Science/empirical_science/Mechatronics, William Bolton.jpeg'
import biobuilder from '../../assets/images/Science/empirical_science/BioBuilder_ Synthetic Biology in the Lab.jpeg'
import chemistry from '../../assets/images/Science/empirical_science/The Chemistry Book, Derek B. Lowe.jpeg'
import artNature from '../../assets/images/Arts/Art Forms in Nature, Ernst Haeckel.jpeg'
import hundredHands from '../../assets/images/Arts/Book of a Hundred Hands, George B. Bridgman.jpeg'

const router = useRouter()

const goToOrder = () => {
  router.push('/books/order')
}

const books = [
  {
    title: 'Clean Code',
    author: 'Robert C. Martin',
    price: '54.90',
    rating: '4.9',
    tag: 'Top',
    image: cleanCode
  },
  {
    title: 'Software Engineering',
    author: 'Ravi Sethi',
    price: '48.00',
    rating: '4.7',
    tag: 'New',
    image: softwareEngineering
  },
  {
    title: 'Computer Science',
    author: 'Allen B. Tucker',
    price: '41.50',
    rating: '4.6',
    tag: 'Hot',
    image: computerScience
  },
  {
    title: 'Mechatronics',
    author: 'William Bolton',
    price: '39.20',
    rating: '4.5',
    tag: 'Best',
    image: mechatronics
  },
  {
    title: 'BioBuilder',
    author: 'Natalie Kuldell',
    price: '35.80',
    rating: '4.4',
    tag: 'Lab',
    image: biobuilder
  },
  {
    title: 'The Chemistry Book',
    author: 'Derek B. Lowe',
    price: '46.90',
    rating: '4.8',
    tag: 'Guide',
    image: chemistry
  },
  {
    title: 'Art Forms in Nature',
    author: 'Ernst Haeckel',
    price: '32.40',
    rating: '4.5',
    tag: 'Art',
    image: artNature
  },
  {
    title: 'Book of a Hundred Hands',
    author: 'George B. Bridgman',
    price: '28.75',
    rating: '4.3',
    tag: 'Sketch',
    image: hundredHands
  }
]

const onSale = [
  { title: 'Clean Code', price: '39.90', discount: 30, image: cleanCode },
  { title: 'Computer Science', price: '29.90', discount: 25, image: computerScience },
  { title: 'Mechatronics', price: '27.50', discount: 20, image: mechatronics },
  { title: 'Art Forms in Nature', price: '19.50', discount: 35, image: artNature }
]
</script>

<style scoped>
:root {
  color-scheme: light;
}

.book-page {
  min-height: 100vh;
  background: radial-gradient(circle at top left, #f3710026 0%, transparent 45%),
    radial-gradient(circle at 80% -20%, #d9220020 0%, transparent 45%),
    #fff7f1;
  color: #2f0c0c;
  padding: 32px 24px 64px;
  font-family: "Inter", "Segoe UI", system-ui, sans-serif;
}

.topbar {
  display: grid;
  grid-template-columns: 1.2fr 1.8fr auto;
  gap: 24px;
  align-items: center;
  margin-bottom: 32px;
}

.brand {
  display: flex;
  align-items: center;
  gap: 16px;
}

.logo {
  width: 52px;
  height: 52px;
  border-radius: 16px;
  display: grid;
  place-items: center;
  font-weight: 700;
  color: #fff7f1;
  background: linear-gradient(140deg, #5a0006, #d92200);
  box-shadow: 0 12px 24px rgba(90, 0, 6, 0.25);
}

.brand h1 {
  margin: 0;
  font-size: 24px;
}

.brand p {
  margin: 4px 0 0;
  color: #7a3b3b;
  font-size: 14px;
}

.search {
  display: grid;
  grid-template-columns: 1fr auto;
  background: #ffffff;
  border-radius: 16px;
  padding: 6px;
  box-shadow: 0 10px 30px rgba(90, 0, 6, 0.12);
}

.search input {
  border: none;
  padding: 12px 14px;
  border-radius: 12px;
  outline: none;
  font-size: 14px;
}

.search-btn {
  border: none;
  background: linear-gradient(135deg, #d92200, #f37100);
  color: #fff7f1;
  padding: 12px 18px;
  border-radius: 12px;
  font-weight: 600;
  cursor: pointer;
}

.nav-links {
  justify-self: end;
  display: flex;
  align-items: center;
  gap: 14px;
  font-weight: 600;
}

.nav-links a {
  text-decoration: none;
  color: #5a0006;
  background: #fff2ea;
  padding: 10px 16px;
  border-radius: 999px;
  font-size: 13px;
  box-shadow: 0 8px 18px rgba(90, 0, 6, 0.1);
}

.nav-links a.primary-link {
  background: #5a0006;
  color: #fff7f1;
  box-shadow: 0 12px 24px rgba(90, 0, 6, 0.25);
}

.layout {
  display: grid;
  grid-template-columns: minmax(220px, 280px) 1fr;
  gap: 32px;
}

.filters {
  background: #ffffff;
  border-radius: 24px;
  padding: 24px;
  box-shadow: 0 12px 30px rgba(90, 0, 6, 0.12);
  display: grid;
  gap: 20px;
}

.filters h2 {
  margin: 0;
  font-size: 20px;
}

.filter-block h3 {
  margin: 0 0 12px;
  font-size: 14px;
  text-transform: uppercase;
  letter-spacing: 0.08em;
  color: #7a3b3b;
}

.filter-block ul {
  list-style: none;
  padding: 0;
  margin: 0;
  display: grid;
  gap: 8px;
  color: #4f2020;
}

.tags {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.tags span {
  background: #fff2ea;
  color: #920004;
  padding: 6px 12px;
  border-radius: 999px;
  font-size: 12px;
}

.range {
  display: grid;
  grid-template-columns: auto 1fr auto;
  align-items: center;
  gap: 8px;
  font-size: 12px;
  color: #7a3b3b;
}

.bar {
  height: 6px;
  background: #ffe0d1;
  border-radius: 999px;
  position: relative;
}

.bar span {
  position: absolute;
  left: 15%;
  width: 55%;
  height: 100%;
  border-radius: inherit;
  background: linear-gradient(90deg, #d92200, #f37100);
}

.apply-btn {
  border: none;
  padding: 12px 16px;
  border-radius: 14px;
  background: linear-gradient(135deg, #920004, #f3500a);
  color: #fff7f1;
  font-weight: 600;
  cursor: pointer;
}

.catalog {
  display: grid;
  gap: 32px;
}

.catalog-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.catalog-header h2 {
  margin: 0;
}

.catalog-header p {
  margin: 6px 0 0;
  color: #7a3b3b;
}

.sort {
  display: flex;
  gap: 12px;
  align-items: center;
  color: #7a3b3b;
}

.sort button {
  border: none;
  padding: 8px 14px;
  border-radius: 999px;
  background: #fff2ea;
  color: #920004;
  font-weight: 600;
}

.grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(220px, 1fr));
  gap: 20px;
}

.book-card {
  background: #ffffff;
  border-radius: 20px;
  overflow: hidden;
  box-shadow: 0 12px 30px rgba(90, 0, 6, 0.1);
  display: grid;
  grid-template-rows: auto 1fr;
  cursor: pointer;
  transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.book-card:hover {
  transform: translateY(-4px);
  box-shadow: 0 16px 34px rgba(90, 0, 6, 0.18);
}

.cover {
  position: relative;
  height: 200px;
  overflow: hidden;
}

.cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.badge {
  position: absolute;
  top: 12px;
  left: 12px;
  background: linear-gradient(135deg, #d92200, #f37100);
  color: #fff7f1;
  padding: 6px 10px;
  border-radius: 999px;
  font-size: 12px;
  font-weight: 600;
}

.info {
  padding: 16px 18px 18px;
  display: grid;
  gap: 10px;
}

.info h3 {
  margin: 0;
  font-size: 16px;
}

.info p {
  margin: 0;
  color: #7a3b3b;
  font-size: 13px;
}

.meta {
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-weight: 600;
}

.price {
  color: #5a0006;
}

.rating {
  color: #f3500a;
}

.card-cta {
  padding: 10px 12px;
  text-align: center;
  border-radius: 12px;
  background: #fff2ea;
  color: #920004;
  text-decoration: none;
  font-weight: 600;
}

.sale-section {
  background: #ffffff;
  border-radius: 24px;
  padding: 24px;
  box-shadow: 0 12px 30px rgba(90, 0, 6, 0.12);
  display: grid;
  gap: 16px;
}

.sale-header h2 {
  margin: 0 0 6px;
}

.sale-header p {
  margin: 0;
  color: #7a3b3b;
}

.sale-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
  gap: 16px;
}

.sale-card {
  background: #fff7f1;
  border-radius: 18px;
  padding: 12px;
  display: grid;
  gap: 10px;
  position: relative;
}

.sale-card img {
  width: 100%;
  height: 140px;
  object-fit: cover;
  border-radius: 14px;
}

.sale-card h4 {
  margin: 0;
  font-size: 14px;
}

.sale-price {
  color: #920004;
  font-weight: 700;
  font-size: 14px;
}

.sale-badge {
  position: absolute;
  top: 12px;
  right: 12px;
  background: #5a0006;
  color: #fff7f1;
  padding: 4px 8px;
  border-radius: 999px;
  font-size: 11px;
}

.newsletter {
  background: linear-gradient(135deg, #920004, #f3500a);
  color: #fff7f1;
  padding: 28px;
  border-radius: 24px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 16px;
  box-shadow: 0 20px 40px rgba(146, 0, 4, 0.3);
}

.newsletter-form {
  display: grid;
  grid-template-columns: 1fr auto;
  gap: 10px;
  background: rgba(255, 255, 255, 0.15);
  padding: 6px;
  border-radius: 14px;
}

.newsletter input {
  border: none;
  padding: 10px 12px;
  border-radius: 10px;
  background: transparent;
  color: #fff7f1;
  outline: none;
}

.newsletter button {
  border: none;
  padding: 10px 16px;
  border-radius: 10px;
  background: #fff7f1;
  color: #920004;
  font-weight: 600;
  cursor: pointer;
}

@media (max-width: 1100px) {
  .topbar {
    grid-template-columns: 1fr;
  }

  .layout {
    grid-template-columns: 1fr;
  }
}

@media (max-width: 720px) {
  .newsletter {
    flex-direction: column;
    align-items: flex-start;
  }

  .newsletter-form {
    width: 100%;
    grid-template-columns: 1fr;
  }
}
</style>
