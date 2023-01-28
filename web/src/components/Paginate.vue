<template>
    <div class="divPaginate">
        <span>1</span>
        <span>2</span>
        <span>3</span>
        <span>4</span>
        <span>...</span>
        <span>44</span>
    </div>
</template>

<script>
export default {
    name: "PaginateComponent"
}
</script>

<style>
.divPaginate{
    display: flex;
    align-content: center;
    justify-content: center;
    padding: 20px;
}

.divPaginate span{
    padding: 8px 15px;
    background: yellow;
    margin: 0 8px;
    border-radius: 50%;
    font-size: 20px;
    cursor: pointer;
    transition: all ease .3s;
}

.divPaginate span:hover{
    transform: scale(0.9);
}
</style>