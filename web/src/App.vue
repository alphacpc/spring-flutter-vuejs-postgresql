<script setup>
  import Header from './components/shared/Header.vue'
  import Footer from './components/shared/Footer.vue'
  
</script>

<template>
    <div>
      <Header/>
      <h1>My Vue App</h1>
      <router-view></router-view>
      <Footer/>
    </div>
</template>

<style scoped>

</style>
