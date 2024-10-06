-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS VentaAuto;
USE VentaAuto;

-- Crear la tabla Marca
CREATE TABLE Marca (
    idMarca INT AUTO_INCREMENT PRIMARY KEY,
    nombreMarca VARCHAR(50) NOT NULL
);

-- Crear la tabla Modelo
CREATE TABLE Modelo (
    idModelo INT AUTO_INCREMENT PRIMARY KEY,
    nombreModelo VARCHAR(50) NOT NULL,
    idMarca INT,
    FOREIGN KEY (idMarca) REFERENCES Marca(idMarca) ON DELETE CASCADE
);

-- Crear la tabla Auto
CREATE TABLE Auto (
    idAuto INT AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR(20),
    precio DECIMAL(10, 2),
    añoFabricacion INT,
    disponible BOOLEAN DEFAULT TRUE,
    idModelo INT,
    placa VARCHAR(10) UNIQUE NOT NULL,
    FOREIGN KEY (idModelo) REFERENCES Modelo(idModelo) ON DELETE CASCADE
);

-- Crear la tabla Cliente
CREATE TABLE Cliente (
    idCliente INT AUTO_INCREMENT PRIMARY KEY,
    nombreCompleto VARCHAR(100) NOT NULL,
    dni VARCHAR(20) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE,
    telefono VARCHAR(20),
    direccion VARCHAR(255),
    codigoCliente VARCHAR(50) UNIQUE NOT NULL,
    limiteCredito DECIMAL(10, 2) DEFAULT 0.00,
    deudaActual DECIMAL(10, 2) DEFAULT 0.00,
    moroso BOOLEAN DEFAULT FALSE
);

-- Crear la tabla Venta
CREATE TABLE Venta (
    idVenta INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    montoInicial DECIMAL(10, 2) NOT NULL,
    montoTotal DECIMAL(10, 2) NOT NULL,
    idAuto INT,
    idCliente INT,
    FOREIGN KEY (idAuto) REFERENCES Auto(idAuto) ON DELETE CASCADE,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente) ON DELETE CASCADE
);

-- Crear la tabla Pago
CREATE TABLE Pago (
    idPago INT AUTO_INCREMENT PRIMARY KEY,
    monto DECIMAL(10, 2) NOT NULL,
    metodoPago VARCHAR(50),
    fechaPago DATE NOT NULL,
    reciboGenerado BOOLEAN DEFAULT FALSE,
    idVenta INT,
    FOREIGN KEY (idVenta) REFERENCES Venta(idVenta) ON DELETE CASCADE
);

-- Crear la tabla CronogramaPago
CREATE TABLE CronogramaPago (
    idCronograma INT AUTO_INCREMENT PRIMARY KEY,
    fechaVencimiento DATE NOT NULL,
    monto DECIMAL(10, 2) NOT NULL,
    pagado BOOLEAN DEFAULT FALSE,
    idVenta INT,
    FOREIGN KEY (idVenta) REFERENCES Venta(idVenta) ON DELETE CASCADE
);

-- Crear la tabla Reporte
CREATE TABLE Reporte (
    idReporte INT AUTO_INCREMENT PRIMARY KEY,
    montoTotal DECIMAL(10, 2) NOT NULL,
    fechaGeneracion DATE NOT NULL,
    idCliente INT,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente) ON DELETE CASCADE
);
