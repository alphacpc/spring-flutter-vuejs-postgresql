<template>
    <div class="divCards grid grid-cols-4 gap-10">
        <div class="divItem" v-for="(item, index) in articles" :item="item" :index="index" :key="index">
            <img src="./../assets/Images/people.jpg" class="float-right" alt="demo">
            <div class="px-2 pt-10">
                <h2 class="text-xl font-black tracking-wider">Patrice Lumumba</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem nemo, nihil quasi culpa incidunt doloremque libero repellat ipsa nisi explicabo! Eius aliquid magnam nostrum? Sapiente cupiditate velit quibusdam esse enim!</p>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'CardPersonComponent',
    
    data(){
        return {
            articles: [{m:"f"},{m:"d"},{m:"f"}, {m:"f"}, {m:"f"}, {m:"f"} ]
        }
    }
}
</script>

<style>
.divItem{
    background: white;
}
</style>