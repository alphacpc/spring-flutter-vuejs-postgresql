<template>
    <div class="list-categories inline-grid grid-cols-12 gap-4">
        <span v-for="category in categories" :key="category.id" class="px-1">
            {{ category.label }}
        </span>
    </div>
</template>

<script>
    export default {
        name: 'CategoriesComponent',

        data() {
        return {
            categories: [
                { label: 'Culture', id : 1 },
                { label: 'Science', id : 2 },
                { label: 'Politique', id : 3 },
                { label: 'Sante', id : 4 },
                { label: 'Résistance', id : 5 },
                { label: 'Sport', id : 6 },
                { label: 'Entreprenariat', id : 7 },
            ]
        }
        }
    }

    
</script>

<style>
.list-categories span{
    background: yellow;
    text-align: center;
    border-radius: 4px;
    padding: 5px;
    cursor: pointer;
}
</style>