<template>
  <div class="divBannerContainer">
    <h1>{{msg}}</h1>
  </div>
</template>

<script>
export default {
  name: 'BannerComponent',
  props: {
    msg: String
  }
}
</script>


<style>
  .divBannerContainer{
    background: url("./../assets/Images/people.jpg") no-repeat;
    background-size: cover;
    height: 50vh;
    width: 100%;
  }
  h1{
    color: #FFF;
  }
</style>