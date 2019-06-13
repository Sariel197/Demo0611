var app = new Vue({
    el: '#app',
    data: {
        pageInfo:'',
    },
    mounted() {
        this.showList()
    },
    methods: {
        showList() {
            axios.get('/rest/serachOne', {
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
    }
})