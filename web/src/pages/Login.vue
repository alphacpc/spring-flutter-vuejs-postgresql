<template>
    <section class="LoginContainer">
        <form>
            <div class="div-logo mb-6">
                <img src="./../assets/Images/favicon.png" alt="africa warriors"/>
            </div>

            <!-- Text panel -->
            <div class="mb-6">
                <h1>Formulaire de connexion</h1>
            </div>
          
            <!-- Email input -->
            <div class="mb-6">
                <input
                type="text"
                class="form-control"
                placeholder="Adresse electronique"/>
            </div>

          <!-- Password input -->
          <div class="mb-6">
            <input
              type="password"
              class="form-control"
              placeholder="Mot de passe"
            />
          </div>

          <div class="flex justify-between items-center mb-6">
            <div class="form-group form-check"></div>
            <a href="#!" class="text-gray-800">Mot de passe oublié ?</a>
          </div>

          <div class="text-center lg:text-left">
            <button type="button" class="btn-login">
              Se connecter
            </button>
          </div>
        </form>
    </section>
</template>

<script>
export default {
  name: "Login",
};
</script>

<style>
.LoginContainer{
    display: flex;
    justify-content: center;
    align-items: center;
    background: linear-gradient(to left, #161820ac, #050505ba),url("./../assets/Images/singin3.jpg") no-repeat center;
    background-size: cover;
    min-height: 100vh;
}

form{
    background: #FFF;
    padding: 50px 20px;
    width: 450px;
    border-radius: 4px;
}

form h1{
    font-size: 25px;
    color: #282A3A;
    text-align: center;
}

.div-logo{
    height: 150px;
}

.div-logo img{
    width: 100%;
    height: 100%;
    object-fit: contain;
}

.form-control{
    width: 100%;
    padding: 10px;
    letter-spacing: 1px;
}
.btn-login{
    background: #282A3A;
    color: #FFF;
    width: 100%;
    padding: 10px;
    border-radius: 4px;
    letter-spacing: 1px;
    text-transform: uppercase;
    font-weight: bold;
    font-family: "Rubik", sans-serif;
}
</style>
