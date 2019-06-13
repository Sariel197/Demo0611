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
            axios.get('/rest/list', {
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        handleShow(Index,row){
            location.href="show.html"
        },
        handleBack(Index,row){
            axios.post('/rest/delete', {
                rid : row
              })
              .then(function (response) {
                console.log(response);
                alert("删除成功！")
              })
              .catch(function (error) {
                console.log(error);
              });
        }
    }
})