$(document).ready(function() { 
        $("#register-form").validate({ 
                rules: { 
                          name: "required", 
                          email: { required: true, email: true }, 
                          password: { required: true, minlength: 5 }, 
                          confirm_password: { required: true, minlength: 5, equalTo: "#password" } 
                }, 
                messages: { 
                         name: "请输入姓名", 
                         email: { required: "请输入Email地址", email: "请输入正确的email地址" }, 
                         password: { required: "请输入密码", minlength: jQuery.format("密码不能小于{0}个字符") }, 
                         confirm_password: { required: "请输入确认密码", minlength: jQuery.format("确认密码不能小于{0}个字符"),
                                                       equalTo: "两次输入密码不一致不一致" } 
              } 
       }); 
}); 