var app = new Vue({
    el: '#app',
    data: {
        username: '',
        password: ''
    },
    mounted() {

    },
    methods: {
        handleLogin() {
            axios.get('/user/login', {
                params: {
                    username: this.username,
                    password:this.password
                }
            })
                .then(function (response) {
                    console.log(response);
                    alert("登录成功！")
                    location.href="list.html"
                })
                .catch(function (error) {
                    console.log(error);
                    alert("登录失败！")
                });
        },
        handleRegister(){
            location.href="register.html"
        }
    },
    
})