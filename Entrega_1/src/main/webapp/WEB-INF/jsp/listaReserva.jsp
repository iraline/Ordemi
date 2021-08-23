<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Suas reservas</h1>
<table border="2" width="70%" padding="2">
	<tr>
		<th>Id Aula</th>
		<th>Cancela</th>
	</tr>
	<c:forEach var="reserva" items="${list}">
		<tr>
			<td>${reserva.idAula}</td>
			<td><a href="deleteReserva/${reserva.idAula}">Deletar</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="perfil">Início</a>
<a href="logout">Sair</a> 