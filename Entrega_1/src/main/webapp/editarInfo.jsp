<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Reservas</h1>
<table border="2" width="70%" padding="2">
	<tr>
		
		<th>Nome</th>
		<th>Hora</th>
		<th>Confirma Presença</th>
		<th>Cancela Reserva</th>
	</tr>
	<c:forEach var="reserva" items="${list}">
		<tr>
			<td>${reserva.nome}</td>
			<td>${arquivo.data}</td>
			<td><a href="deleteReserva/${arquivo.id}">Deletar</a></td>
			<td><a href="visualizarArquivo">Visualizar arquivo</a>
		</tr>
	</c:forEach>
</table>
<br />
<a href="perfil">Início</a>
<a href="logout">Sair</a> 