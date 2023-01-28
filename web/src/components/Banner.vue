<template>
  <div class="divBannerContainer">
    <h1>Africa Warriors</h1>
    <input type="search" id="InputSearch" placeholder="Recherche. . ."/>
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
    background: linear-gradient(to bottom, #282a3a4d, #282a3a),url("./../assets/Images/people.jpg") no-repeat;
    background-size: cover;
    height: 55vh;
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: end;
  }
  #InputSearch{
    background: #282a3a4d;
    color: #FFF;
    width: 30vw;
    padding: 10px 25px;
    font-size: 18px;
    border-radius: 40px;
    outline: 0;
    letter-spacing: 1px;
  }
  h1{
    font-family: "Rubik";
    color: #FFF;
    font-size: 140px;
    font-weight: bold;
    letter-spacing: 1px;
  }
</style>