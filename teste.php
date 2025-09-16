    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Usuários</title>
        </head>
        <body>
            <h1>Lista de usuários</h1>
            <div id="usuarios"> Carregando...</div>
            <script>
                fetch('api/api.php')
                .then(response => response.json())
                .then(data => {
                    const container =
                        document.getElementById('usuarios');
                    if(data.erro){
                        container.innerText =
                            'Erro: ' + data.erro;
                    }
                if(data.length === 0){
                    container.innerText =
                        'Nenhum usuário';   
                }

                let html = '<ul>';
                data.forEach(usuario =>{
                    html += '<li>' + JSON.stringify(usuario) + '</li>'
                });
                html = '</ul>';
                container.innerHTML = html;
            }).catch(error =>{
                    const container =
                        document.getElementById('usuarios').innerText = 'Erro';
                    console.error(data.erro);
                });
            </script>
        </body>
    </html>