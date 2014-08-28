$(document).ready(function() { 
        $("#register-form").validate({ 
                rules: { 
                          name: "required", 
                          email: { required: true, email: true }, 
                          password: { required: true, minlength: 5 }, 
                          confirm_password: { required: true, minlength: 5, equalTo: "#password" } 
                }, 
                messages: { 
                         name: "����������", 
                         email: { required: "������Email��ַ", email: "��������ȷ��email��ַ" }, 
                         password: { required: "����������", minlength: jQuery.format("���벻��С��{0}���ַ�") }, 
                         confirm_password: { required: "������ȷ������", minlength: jQuery.format("ȷ�����벻��С��{0}���ַ�"),
                                                       equalTo: "�����������벻һ�²�һ��" } 
              } 
       }); 
}); 