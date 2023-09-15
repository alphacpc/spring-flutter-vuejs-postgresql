<script setup>

</script>

<template>
    <div class="container-login h-full">
      <div className="flex justify-center items-center bg-purple-400">

        <form method="post" className="bg-red-300 w-[20rem] px-4 rounded-sm shadow-md">
            <div class="relative flex items-center my-4">
                <h1 className="font-extrabold text-center w-full text-2xl z-10">alphacpc</h1>
                <span class="absolute p-5 bg-lime-400 left-1/2 rounded-full"></span>
            </div>

            <div className="form-group flex items-center bg-lime-300 rounded-full pl-4 mb-4">
                <fa icon="user"/>
                <input name="username" type="text" id="name" className="outline-none p-2 text-lg bg-transparent" placeholder="Non d'utilisateur" />
            </div>

            <div className="form-group flex items-center bg-lime-300 rounded-full pl-4 mb-4">
                <fa icon="lock"/>
                <input name="username" type="text" id="name" className="outline-none p-2 text-lg bg-transparent" placeholder="Non d'utilisateur" />
            </div>

            <!-- <div className="form-group flex items-center">
                <fa icon="lock"/>
                <input/>
            </div> -->

            <div className="form-group">
            </div>

            <button className="p-2 rounded-full w-full font-semibold bg-orange-500">se connecter</button>

        </form>

      </div>
    </div>
</template>

<style scoped>

</style>
