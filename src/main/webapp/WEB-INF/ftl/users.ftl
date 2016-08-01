<table>
<#list users as user>
  <tr>
  <td>${user.uid}</td>
   <td>${user.uname}</td>
    <td>${user.upwd}</td>
  </tr>

</#list>
</table>