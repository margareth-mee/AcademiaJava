<!DOCTYPE html>
<html lang="py-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Produto</title>
</head>
<body>
    <h1>Cadastro de Produto</h1>
    <form action="/vendas-1/produto" method="post">
        nome: <input type="text" name="nome" id="nome"> <br />
        valor: <input type="number" name="valor" id="valor" step="0.01"> <br />
        id_categoria: <input type="number" name="id_categoria" id="id_categoria"> <br />
        <input type="submit" value="Salvar">
    </form>
</body>
</html>