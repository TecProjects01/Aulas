<?php
    header('Content-Type: application/json');
    header('Access-Controll-All-Origin: *');

    $host = "localhost";
    $dbnome = "api";
    $user = "root";
    $password = "ifsp";

    $conn = new mysqli($host, $user, $password, $dbnome);

    if($conn -> connect_error)
    {
        die(json_encode(['erro' => 'Erro na conexão']));
    }
    $sql = "SELECT * FROM usuarios";

    $result = $conn -> query($sql);

    $usuarios = [];
    
    while($row = $result -> fetch_assoc())
    {
        $usuarios[] = $row;
    }

    echo json_encode($usuarios);
?>