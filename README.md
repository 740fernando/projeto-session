# Interface HttpSession
<p>Fornece uma maneira de identificar um usuário em mais de uma solicitação de página ou visita a um site e de armazenar informações sobre esse usuário.</p>
<p>O contêiner de servlet usa essa interface para criar uma sessão entre um cliente HTTP e um servidor HTTP. A sessão persiste por um período de tempo especificado, em mais de uma conexão ou solicitação de página do usuário. Uma sessão geralmente corresponde a um usuário, 
que pode visitar um site várias vezes. O servidor pode manter uma sessão de várias maneiras, como usar cookies ou reescrever URLs.</p>

<p>Esta interface permite que os servlets : </p>

- Visualize e manipule informações sobre uma sessão, como o identificador da sessão, hora de criação e hora do último acesso
- Vincular objetos a sessões, permitindo que as informações do usuário persistam em várias conexões de usuário
