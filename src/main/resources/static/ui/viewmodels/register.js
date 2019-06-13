var app = new Vue({
    el: '#app',
    data: {
        username: '',
        password: '',
        captcha: ''
    },
    mounted() {

    },
    methods: {
        handleRegister() {
            axios.post('/user/register', {
                params: {
                    username: this.username,
                    password: this.password,
                    captcha: this.captcha
                }
            })
                .then(function (response) {
                    console.log(response);
                    alert("注册成功！")
                    location.href = "demo.html"
                })
                .catch(function (error) {
                    console.log(error);
                    alert("注册失败！")
                    location.reload();
                });
        }
    },

})