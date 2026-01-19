<template>
  <div class="app">
    <header class="topbar">
      <h1>Bookstore</h1>
      <nav>
        <RouterLink to="/books">图书管理</RouterLink>
        <RouterLink to="/dashboard">数据看板</RouterLink>
      </nav>
    </header>
    <main class="content">
      <RouterView />
    </main>
  </div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>
