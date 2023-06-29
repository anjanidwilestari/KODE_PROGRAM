-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Des 2021 pada 16.51
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `kategori_obat` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`kategori_obat`, `nama`) VALUES
(1, 'Obat Dalam'),
(2, 'Obat Luar');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `id_obat` int(11) NOT NULL,
  `kode_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `kategori_obat` int(11) NOT NULL,
  `jenis_obat` varchar(20) NOT NULL,
  `merek_obat` varchar(100) NOT NULL,
  `harga_beli_obat` int(11) NOT NULL,
  `harga_jual_obat` int(11) NOT NULL,
  `jumlah_obat` int(3) NOT NULL,
  `tanggal_masuk` varchar(50) NOT NULL,
  `expired` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`id_obat`, `kode_obat`, `nama_obat`, `kategori_obat`, `jenis_obat`, `merek_obat`, `harga_beli_obat`, `harga_jual_obat`, `jumlah_obat`, `tanggal_masuk`, `expired`) VALUES
(1, 'A1', 'Bodrex', 1, 'Pil', 'Bodrek', 2500, 3000, 194, '2021-12-22 13:15:41', '2022-01-31'),
(2, 'A2', 'Inzana', 1, 'Pil', 'Inzana', 1000, 2000, 228, '2021-12-22 13:16:36', '2022-02-28'),
(3, 'A3', 'Komix', 1, 'Botol', 'Komiko', 10000, 15000, 271, '2021-12-22 13:17:39', '2022-03-31'),
(4, 'A4', 'Salep 88', 2, 'Salep', 'Salepku', 20000, 25000, 231, '2021-12-22 13:18:35', '2022-06-30'),
(5, 'A5', 'Oskadon', 1, 'Pil', 'Oskadon SP', 3000, 4500, 386, '2021-12-22 13:19:28', '2022-04-04'),
(6, 'A6', 'Minyak Kayu Putih', 2, 'Minyak', 'Gadjah', 15000, 20000, 100, '2021-12-24', '2022-12-24'),
(7, 'A7', 'Multivitamin Syrup', 1, 'Sirup', 'vito-vin', 25000, 35000, 200, '2021-12-24', '2022-12-1'),
(8, 'A8', 'Promag', 1, 'tablet', 'promag', 8000, 10000, 233, '2021-12-24', '2022-11-9'),
(10, 'A9', 'Dermatix Ultra', 2, 'Salep', 'Dermatix', 13000, 17000, 310, '2021-12-24', '2022-12-12');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `nomor` int(100) NOT NULL,
  `kode_transaksi` varchar(60) NOT NULL,
  `nama_pembeli` varchar(40) NOT NULL,
  `kode_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `merek_obat` varchar(100) NOT NULL,
  `harga_jual` int(20) NOT NULL,
  `jumlah_beli` int(20) NOT NULL,
  `total_harga` int(20) NOT NULL,
  `tanggal_transaksi` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`nomor`, `kode_transaksi`, `nama_pembeli`, `kode_obat`, `nama_obat`, `merek_obat`, `harga_jual`, `jumlah_beli`, `total_harga`, `tanggal_transaksi`) VALUES
(1, 'AP/24122021/000001', 'Anjani', 'A2', 'Inzana', 'Inzana', 2000, 2, 4000, '2021-12-24'),
(2, 'AP/24122021/000002', 'Ifa', 'A7', 'Multivitamin Syrup', 'vito-vin', 35000, 1, 35000, '2021-12-24'),
(3, 'AP/24122021/000003', 'Dwi', 'A8', 'Promag', 'Promag', 10000, 3, 30000, '2021-12-24'),
(4, 'AP/24122021/000004', 'Indria', 'A9', 'Dermatix Ultra', 'Dermatix', 17000, 1, 17000, '2021-12-24'),
(5, 'AP/24122021/000005', 'Tari', 'A10', 'Panadol Extra', 'Panadol', 10000, 2, 20000, '2021-12-24'),
(6, 'AP/24122021/000006', 'Ningsih', 'A1', 'Bodrek', 'Bodrek', 3000, 5, 15000, '2021-12-24'),
(7, 'AP/24122021/000007', 'lesta', 'A3', 'Komix', 'Komiko', 15000, 1, 15000, '2021-12-24'),
(8, 'AP/24122021/000008', 'Fasi', 'A4', 'Salep 88', 'Salepku', 25000, 1, 25000, '2021-12-24'),
(9, 'AP/24122021/000009', 'Ayi', 'A5', 'Oskadon', 'Oskadon SP', 4500, 2, 9000, '2021-12-24'),
(11, 'AP/24122021', 'Fai', 'A6', 'Minyak Kayu Putih', 'Gadjah', 20000, 2, 40000, '10000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `email` varchar(50) NOT NULL,
  `no_hp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama`, `jenis_kelamin`, `username`, `password`, `alamat`, `email`, `no_hp`) VALUES
(1, 'Ifa Indrian Ningsih', 'Perempuan', 'ifaindria', 'ifa1234', 'Jombang', 'ifaindria152@gmail.com', '082123456789'),
(2, 'Anjani Dwilestari', 'Perempuan', 'admin', '123', 'Pasuruan', 'ayi@polinema.ac.id', '085667889001');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`kategori_obat`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`nomor`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kategori`
--
ALTER TABLE `kategori`
  MODIFY `kategori_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `obat`
--
ALTER TABLE `obat`
  MODIFY `id_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `nomor` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
