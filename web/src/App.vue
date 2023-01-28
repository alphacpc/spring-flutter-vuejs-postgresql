<template>
  <div class="" style="background:#E6DDC4">
    <BannerComponent msg="Welcome to Your Vue.js App"/>
    <div class="container mx-auto my-10">
      <CategoriesComponent/>
      <CardPersonComponent class="my-5"/>
    </div>
  </div>
</template>

<script>
import BannerComponent from "./components/Banner.vue"
import CategoriesComponent from "./components/Categories.vue"
import CardPersonComponent from "./components/CardPerson.vue"
export default {
  name: 'App',
  components: {
    BannerComponent,
    CategoriesComponent,
    CardPersonComponent
  }
}
</script>

