<script setup>
  import Header from './components/shared/Header.vue'
  import Footer from './components/shared/Footer.vue'
  import Carousel from './components/Carousel.vue'
  
</script>

<template>
    <div class="container-app">
      <Header/>
      
      <div className="bg-slate-100 min-h-[80vh]">

        <Carousel/>

        <router-view></router-view>
      </div>

      <Footer/>
    </div>
</template>

<style scoped>

</style>
