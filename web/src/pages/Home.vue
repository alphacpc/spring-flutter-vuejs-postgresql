<template>
  <div class="mainContainer" style="background:#E2E2E2">
    <BannerComponent msg="Welcome to Your Vue.js App"/>
    <div class="container mx-auto my-10">
      <CategoriesComponent/>
      <CardPersonComponent class="my-5"/>
      <PaginateComponent/>
    </div>
  </div>
</template>

<script>
import BannerComponent from "../components/Banner.vue"
import CategoriesComponent from "../components/Categories.vue"
import CardPersonComponent from "../components/CardPerson.vue"
import PaginateComponent from "../components/Paginate.vue"

export default {
  name: 'Home',
  components: {
    BannerComponent,
    CategoriesComponent,
    CardPersonComponent,
    PaginateComponent
  }
}
</script>

<style>
  .mainContainer{
    padding-bottom: 20px;
  }
</style>