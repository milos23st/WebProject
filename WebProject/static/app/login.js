Vue.component("login-page", {
    data: function(){
        return{
            user: {
                username: null,
                password: null
            },
            error: null,
            usernameEmpty: false,
            passwordEmpty: false,
            usernameClass: 'form-control',
            passwordClass: 'form-control'
        }
    },

    template:/*html*/ `
        <div class="limiter">
    <div class="login-dark">
        <div class="login-container">
       <!-- <form method="post"> -->
           <p>Login Form</p>
            <div class="illustration">
                <i class="icon ion-ios-locked-outline"></i>
            </div>
            <div class="form-group form-floating">
                <input v-on:input="isUsernameEmpty" v-model="user.username" v-bind:class="usernameClass" placeholder="Email">
                <label for="floatingInput">Username</label>
                <span v-if="usernameEmpty" class="error-message">Please enter your username.</span>
            </div>
            <div class="form-group form-floating">
                <input v-on:input="isPasswordEmpty" v-model="user.password" v-bind:class="passwordClass" type="password" placeholder="Password">
                <label for="floatingPassword">Password</label>
                 <span v-if="passwordEmpty" class="error-message">Please enter your password.</span>
            </div>
            &nbsp
             <hr> 	
                <span v-if="error!=null" class="error-message">{{error}}</span>
            <div class="form-group">
                <button v-on:click="login" class="btn btn-primary btn-block" type="submit">Log In</button>
            </div><a href="#" class="forgot">Not registered? Click here</a>
       <!-- </form> -->
    </div>
</div>
</div>
    `
    ,
    methods: {
        login: function(user){
            this.isUsernameEmpty();
            this.isPasswordEmpty();
            if(this.passwordEmpty || this.usernameEmpty){
                return;
            }
            else{ 
            axios
                .post('/login', {"username": ''+this.user.username, "password": ''+this.user.password})
                .then(response => {
                    this.error = null;
                    window.localStorage.setItem('user', response.data);
                })
                .catch(error => {
                    this.error = error.response.data['message'];
                })

        }},
        isUsernameEmpty: function(){
            if(this.user.username == '' || this.user.username == null){
                this.usernameEmpty = true;
      
            }
            else{ 
            this.usernameEmpty = false;
            }
        },
        isPasswordEmpty: function(){
            if(this.user.password == '' || this.user.password == null){
                this.passwordEmpty = true;
            }
            else{
                this.passwordEmpty = false;
            }
        }
    }
});