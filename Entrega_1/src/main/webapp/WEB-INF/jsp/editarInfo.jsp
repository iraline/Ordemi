<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Meu perfil</h1>
<table border="2" width="70%" padding="2">
	<tr>

		<th>Nome</th>
		<th>Email</th>
		<th>Plano</th>

	</tr>

	<tr>
		<td>${usuarioLogado.nome}</td>
		<td>${usuarioLogado.email}</td>
		<td>${usuarioLogado.plano}</td>
	</tr>
</table>
<br />
<a href="perfil">In�cio</a>
<a href="logout">Sair</a>
