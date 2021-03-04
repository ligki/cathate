<template>
    <div class="fact-container">
        <div class="fact-wrapper p-2">
            <div class="cat-gif pr-1">
                <img class="rounded-circle z-depth-2" v-bind:src="renderRandomGifUrl()">
            </div>
            <div class="cat-fact text-center m-auto">
                {{catFact}}
            </div>
        </div>
        <div class="fact-stick text-center py-1 font-italic">
            <h6>Cat facts</h6>
        </div>
    </div>
</template>

<script>
import FactService from "../service/FactService";

export default {
    data() {
        return {
            catFact: ''
        }
    },
    methods: {
        renderRandomFact() {
            FactService.getRandomFact()
                .then(response => {
                    this.catFact = response.data.fact
                })
                .catch(error => {
                    console.log(error);
                })
        },
        renderRandomGifUrl() {
            return FactService.getRandomGifUrl();
        }
    },
    created() {
        this.renderRandomFact();
    }

}
</script>

<style scoped>
.cat-gif img{
    width: 100px;
    height: 100px;
}
.fact-container {
    background-image: url("data:image/svg+xml,%3csvg width='100%25' height='100%25' xmlns='http://www.w3.org/2000/svg'%3e%3crect width='100%25' height='100%25' fill='none' stroke='black' stroke-width='4' stroke-dasharray='6%2c 14' stroke-dashoffset='0' stroke-linecap='square'/%3e%3c/svg%3e");
}
.fact-wrapper {
    display: flex;
}
.fact-stick {
    display: block;
    width: 100%;
}

</style>