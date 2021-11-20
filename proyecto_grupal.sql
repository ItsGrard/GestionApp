-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2021 a las 18:09:17
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_grupal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividades`
--

CREATE TABLE `actividades` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `horas_dia` int(11) NOT NULL,
  `observaciones` text DEFAULT NULL,
  `alumno_id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actividades`
--

INSERT INTO `actividades` (`id`, `nombre`, `fecha`, `horas_dia`, `observaciones`, `alumno_id`) VALUES
(1, 'Proyecto grupal', '2021-11-23', 2, 'Entregar antes de la fecha máxima.', 1),
(3, 'Realizar views en SnowFlake', '2021-11-20', 8, 'Realizar Views para que la empresa consulte las tablas mas rapido.', 1),
(6, 'nueva', '2021-11-20', 8, 'Nueva actividad', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(11) NOT NULL,
  `dni` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `clave` varchar(50) NOT NULL,
  `horas_dual` int(11) NOT NULL,
  `horas_fct` int(11) NOT NULL,
  `observaciones` text NOT NULL,
  `empresa_id` int(11) NOT NULL,
  `profesor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `dni`, `nombre`, `apellidos`, `fecha_nacimiento`, `telefono`, `email`, `clave`, `horas_dual`, `horas_fct`, `observaciones`, `empresa_id`, `profesor_id`) VALUES
(1, '77190622T', 'Jesus', 'Ariza', '1995-01-22', 603548632, 'jmoisesariza@gmail.com', 'jesus', 2000, 410, 'Miembro de la javaSquad', 2, 2),
(2, '12345678J', 'Alberto ', 'Naranjo Nuñez', '2001-11-14', 987456321, 'alberto@cesurformacion.com', 'alberto', 0, 0, 'Alumno con gran proyección', 11, 4),
(3, '60254789P', 'Alejandro', 'Vicente', '2002-11-13', 625852146, 'alejandro@cesurformacion.com', 'alejandro', 10, 0, 'Alumno con capacidad creativa. ', 9, 2),
(4, '32216554B', 'Alejandro', 'Trujillo', '2001-11-11', 652201478, 'trujillo@cesurformacion.com', 'trujillo', 10, 0, 'Alumno con superpoderes.', 7, 2),
(5, '88854127C', 'Alejandro', 'Aguilar', '2001-11-03', 663255477, 'aguilar@cesurformacion.com', 'aguilar', 21, 0, 'Alumno constante.', 5, 3),
(6, '32216589D', 'Carlos', 'Fortes', '2001-11-24', 655598888, 'carlos@cesurformacion.com', 'carlos', 12, 0, 'Alumno con habilidades contextuales', 2, 4),
(7, '44116688F', 'Christopher', 'Gonzalez', '2000-11-30', 663322558, 'cris@cesurformacion.com', 'cris', 15, 0, 'Alumno con dotes legendarias', 10, 5),
(8, '78458956G', 'Daniel', 'Mena', '2001-11-01', 658985471, 'daniel@cesurformación.com', 'daniel', 10, 0, 'Alumno atento', 11, 3),
(9, '89784589H', 'David', 'Gonzalez', '2002-11-06', 662233551, 'david@cesurformacion.com', 'david', 15, 0, 'Alumno creativo', 8, 2),
(10, '55228877J', 'David', 'Ramos', '2001-12-13', 661224883, 'ramos@cesurformación.com', 'ramos', 10, 0, 'Alumno muy querido', 11, 3),
(11, '12124578K', 'Diego', 'Gaitán', '1996-11-15', 656544789, 'diego@cesurformacion.com', 'diego', 45, 1, 'Alumno que tira para adelante', 9, 5),
(12, '89455645L', 'Gerardo', 'Marín', '2021-11-13', 655465548, 'gerardo@cesurformación.com', 'gerardo', 15, 0, 'Alumno muy puntual', 7, 5),
(13, '562361245L', 'Guillermo', 'Castillo', '2001-11-01', 639528417, 'guillermo@cesurformacion.com', 'guillermo', 15, 0, 'Alumno con gran vocabulario léxico', 11, 4),
(14, '12234556Ñ', 'Juan', 'Lamas', '2000-11-23', 654321987, 'juan@cesurformación.com', 'juan', 15, 0, 'Alumno constante', 9, 2),
(15, '12457896P', 'Robbe', 'Toichoa', '1997-11-07', 645978312, 'robbe@cesurformacion.com', 'robbe', 15, 0, 'Alumno muy aplicado', 7, 3),
(16, '123741852O', 'Marco', 'Testa', '2001-05-17', 654123789, 'marco@cesurformación.com', 'marco', 15, 0, 'Alumno internacional', 10, 4),
(17, '145256325O', 'Pablo', 'Hierrezuelo', '1996-04-11', 623512012, 'pablo@cesurformacion.com', 'pablo', 48, 0, 'Alumno multitarea', 8, 5),
(18, '124578014U', 'Ridouan ', 'Tieb', '1989-04-28', 654103321, 'tieb@cesurformación.com', 'tieb', 12, 0, 'Alumno con experiencia', 9, 2),
(19, '147852145Y', 'Roberto', 'García', '2001-11-15', 654789874, 'roberto@cesurformacion.com', 'roberto', 14, 0, 'Alumno con proyección', 10, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `telefono` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `responsable` varchar(50) NOT NULL,
  `observaciones` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`id`, `nombre`, `telefono`, `email`, `responsable`, `observaciones`) VALUES
(2, 'Cabsan', 603504535, 'cabsan@gmail.com', 'Luis', 'Jefe de la empresa'),
(5, 'Aquila', 632548785, 'aquila@gmail.com', 'Ramon', 'Empresa en condiciones de contratar alumnos'),
(7, 'Apple Inc.', 987456321, 'apple@apple.com', 'Steve Mcwin', 'Gran tecnológica '),
(8, 'Microsoft', 963258741, 'microsoft@microsoft.com', 'Barry Allen', 'Expandiéndose en España'),
(9, 'Amazon Inc.', 962358741, 'amazon@amazon.com', 'Son Guijun', 'En tiempo de contrataciones'),
(10, 'Facebook', 932145687, 'facebook@facebook.com', 'Marc Wallberg', 'Metaverse project en curso, necesidad de empleabilidad'),
(11, 'Alibaba Group', 951236874, 'alibaba@group.com', 'Park Ji-sung', 'Abierto a nuevas propuestas de negocio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `id` int(11) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `clave` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`id`, `dni`, `nombre`, `apellidos`, `email`, `clave`) VALUES
(2, '77190623T', 'Francisco', 'Gonzalez', 'francisco@cesur.com', 'francisco'),
(3, '33359125V', 'Jose', 'Marquez', 'jose@cesur.com', 'jose'),
(4, '78894556A', 'Emilia ', 'Pauna', 'emilia@cesur.com', 'emilia'),
(5, '32216554B', 'Javier ', 'Artacho', 'javier@cesur.com', 'javier');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `alumno_id` (`alumno_id`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `profesor_id` (`profesor_id`),
  ADD KEY `empresa_id` (`empresa_id`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividades`
--
ALTER TABLE `actividades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD CONSTRAINT `actividades_ibfk_1` FOREIGN KEY (`alumno_id`) REFERENCES `alumnos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`profesor_id`) REFERENCES `profesor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `alumnos_ibfk_2` FOREIGN KEY (`empresa_id`) REFERENCES `empresa` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
