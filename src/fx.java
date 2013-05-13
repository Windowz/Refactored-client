/*      */ public class fx extends fv
/*      */ {
/*      */   static int[] az;
/*      */   public static final int k = 9;
/*      */   static boolean w;
/*      */   public static boolean e;
/*      */   static int b;
/*    8 */   static boolean u = false;
/*      */   static final int t = 3500;
/*      */   static final int f = 16;
/*      */   static int[] am;
/*      */   static final int o = 3;
/*      */   static int a;
/*      */   public static int[] ah;
/*      */   static final int y = 50;
/*      */   static int p;
/*      */   public static int[] an;
/*      */   static int ac;
/*      */   static int aa;
/*      */   static int x;
/*      */   static int as;
/*      */   public static int[] ap;
/*      */   public static aw av;
/*      */   static int[] ak;
/*      */   static int h;
/*      */   static int ad;
/*    9 */   static boolean v = false;
/*      */ 
/*      */   static final void ca(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 1473 */     if (u) {
/* 1474 */       if (paramInt5 > x) paramInt5 = x;
/* 1475 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 1477 */     if (paramInt4 >= paramInt5) return;
/* 1478 */     paramInt3 += paramInt4;
/* 1479 */     paramInt6 += paramInt7 * paramInt4;
/* 1480 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 1481 */     if (w)
/*      */     {
/* 1487 */       i5 = paramInt4 - a;
/* 1488 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1489 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1490 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1491 */       i4 = paramInt10 >> 12;
/* 1492 */       if (i4 != 0) {
/* 1493 */         n = paramInt8 / i4;
/* 1494 */         i1 = paramInt9 / i4;
/* 1495 */         if (n < 0) n = 0;
/* 1496 */         else if (n > 4032) n = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1499 */         n = 0;
/* 1500 */         i1 = 0;
/*      */       }
/* 1502 */       paramInt8 += paramInt11;
/* 1503 */       paramInt9 += paramInt12;
/* 1504 */       paramInt10 += paramInt13;
/* 1505 */       i4 = paramInt10 >> 12;
/* 1506 */       if (i4 != 0) {
/* 1507 */         i2 = paramInt8 / i4;
/* 1508 */         i3 = paramInt9 / i4;
/* 1509 */         if (i2 < 0) i2 = 0;
/* 1510 */         else if (i2 > 4032) i2 = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1513 */         i2 = 0;
/* 1514 */         i3 = 0;
/*      */       }
/* 1516 */       paramInt1 = (n << 20) + i1;
/* 1517 */       j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1518 */       m >>= 3;
/* 1519 */       paramInt7 <<= 3;
/* 1520 */       i = paramInt6 >> 8;
/* 1521 */       if (v) {
/* 1522 */         if (m > 0) {
/*      */           do {
/* 1524 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1525 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1526 */             paramInt1 += j;
/* 1527 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1528 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1529 */             paramInt1 += j;
/* 1530 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1531 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1532 */             paramInt1 += j;
/* 1533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1535 */             paramInt1 += j;
/* 1536 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1537 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1538 */             paramInt1 += j;
/* 1539 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1540 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1541 */             paramInt1 += j;
/* 1542 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1543 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1544 */             paramInt1 += j;
/* 1545 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1546 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1547 */             paramInt1 += j;
/* 1548 */             n = i2;
/* 1549 */             i1 = i3;
/* 1550 */             paramInt8 += paramInt11;
/* 1551 */             paramInt9 += paramInt12;
/* 1552 */             paramInt10 += paramInt13;
/* 1553 */             i4 = paramInt10 >> 12;
/* 1554 */             if (i4 != 0) {
/* 1555 */               i2 = paramInt8 / i4;
/* 1556 */               i3 = paramInt9 / i4;
/* 1557 */               if (i2 < 0) i2 = 0;
/* 1558 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1561 */               i2 = 0;
/* 1562 */               i3 = 0;
/*      */             }
/* 1564 */             paramInt1 = (n << 20) + i1;
/* 1565 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1566 */             paramInt6 += paramInt7;
/* 1567 */             i = paramInt6 >> 8;
/* 1568 */             m--; } while (m > 0);
/*      */         }
/* 1570 */         m = paramInt5 - paramInt4 & 0x7;
/* 1571 */         if (m > 0)
/*      */           do {
/* 1573 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1574 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1575 */             paramInt1 += j;
/* 1576 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1580 */         if (m > 0) {
/*      */           do {
/* 1582 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1583 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1585 */             paramInt3++;
/* 1586 */             paramInt1 += j;
/* 1587 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1588 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1590 */             paramInt3++;
/* 1591 */             paramInt1 += j;
/* 1592 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1593 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1595 */             paramInt3++;
/* 1596 */             paramInt1 += j;
/* 1597 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1598 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1600 */             paramInt3++;
/* 1601 */             paramInt1 += j;
/* 1602 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1603 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1605 */             paramInt3++;
/* 1606 */             paramInt1 += j;
/* 1607 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1608 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1610 */             paramInt3++;
/* 1611 */             paramInt1 += j;
/* 1612 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1613 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1615 */             paramInt3++;
/* 1616 */             paramInt1 += j;
/* 1617 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1618 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1620 */             paramInt3++;
/* 1621 */             paramInt1 += j;
/* 1622 */             n = i2;
/* 1623 */             i1 = i3;
/* 1624 */             paramInt8 += paramInt11;
/* 1625 */             paramInt9 += paramInt12;
/* 1626 */             paramInt10 += paramInt13;
/* 1627 */             i4 = paramInt10 >> 12;
/* 1628 */             if (i4 != 0) {
/* 1629 */               i2 = paramInt8 / i4;
/* 1630 */               i3 = paramInt9 / i4;
/* 1631 */               if (i2 < 0) i2 = 0;
/* 1632 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1635 */               i2 = 0;
/* 1636 */               i3 = 0;
/*      */             }
/* 1638 */             paramInt1 = (n << 20) + i1;
/* 1639 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1640 */             paramInt6 += paramInt7;
/* 1641 */             i = paramInt6 >> 8;
/* 1642 */             m--; } while (m > 0);
/*      */         }
/* 1644 */         m = paramInt5 - paramInt4 & 0x7;
/* 1645 */         if (m > 0) {
/*      */           do {
/* 1647 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1648 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1650 */             paramInt3++;
/* 1651 */             paramInt1 += j;
/* 1652 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1662 */       i5 = paramInt4 - a;
/* 1663 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1664 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1665 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1666 */       i4 = paramInt10 >> 14;
/* 1667 */       if (i4 != 0) {
/* 1668 */         n = paramInt8 / i4;
/* 1669 */         i1 = paramInt9 / i4;
/* 1670 */         if (n < 0) n = 0;
/* 1671 */         else if (n > 16256) n = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1674 */         n = 0;
/* 1675 */         i1 = 0;
/*      */       }
/* 1677 */       paramInt8 += paramInt11;
/* 1678 */       paramInt9 += paramInt12;
/* 1679 */       paramInt10 += paramInt13;
/* 1680 */       i4 = paramInt10 >> 14;
/* 1681 */       if (i4 != 0) {
/* 1682 */         i2 = paramInt8 / i4;
/* 1683 */         i3 = paramInt9 / i4;
/* 1684 */         if (i2 < 0) i2 = 0;
/* 1685 */         else if (i2 > 16256) i2 = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1688 */         i2 = 0;
/* 1689 */         i3 = 0;
/*      */       }
/* 1691 */       paramInt1 = (n << 18) + i1;
/* 1692 */       j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1693 */       m >>= 3;
/* 1694 */       paramInt7 <<= 3;
/* 1695 */       i = paramInt6 >> 8;
/* 1696 */       if (v) {
/* 1697 */         if (m > 0) {
/*      */           do {
/* 1699 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1700 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1701 */             paramInt1 += j;
/* 1702 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1703 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1704 */             paramInt1 += j;
/* 1705 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1706 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1707 */             paramInt1 += j;
/* 1708 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1709 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1710 */             paramInt1 += j;
/* 1711 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1712 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1713 */             paramInt1 += j;
/* 1714 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1715 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1716 */             paramInt1 += j;
/* 1717 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1718 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1719 */             paramInt1 += j;
/* 1720 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1721 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1722 */             paramInt1 += j;
/* 1723 */             n = i2;
/* 1724 */             i1 = i3;
/* 1725 */             paramInt8 += paramInt11;
/* 1726 */             paramInt9 += paramInt12;
/* 1727 */             paramInt10 += paramInt13;
/* 1728 */             i4 = paramInt10 >> 14;
/* 1729 */             if (i4 != 0) {
/* 1730 */               i2 = paramInt8 / i4;
/* 1731 */               i3 = paramInt9 / i4;
/* 1732 */               if (i2 < 0) i2 = 0;
/* 1733 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1736 */               i2 = 0;
/* 1737 */               i3 = 0;
/*      */             }
/* 1739 */             paramInt1 = (n << 18) + i1;
/* 1740 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1741 */             paramInt6 += paramInt7;
/* 1742 */             i = paramInt6 >> 8;
/* 1743 */             m--; } while (m > 0);
/*      */         }
/* 1745 */         m = paramInt5 - paramInt4 & 0x7;
/* 1746 */         if (m > 0)
/*      */           do {
/* 1748 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1749 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1750 */             paramInt1 += j;
/* 1751 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1755 */         if (m > 0) {
/*      */           do {
/* 1757 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1758 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1760 */             paramInt3++;
/* 1761 */             paramInt1 += j;
/* 1762 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1763 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1765 */             paramInt3++;
/* 1766 */             paramInt1 += j;
/* 1767 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1768 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1770 */             paramInt3++;
/* 1771 */             paramInt1 += j;
/* 1772 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1773 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1775 */             paramInt3++;
/* 1776 */             paramInt1 += j;
/* 1777 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1778 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1780 */             paramInt3++;
/* 1781 */             paramInt1 += j;
/* 1782 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1783 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1785 */             paramInt3++;
/* 1786 */             paramInt1 += j;
/* 1787 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1788 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1790 */             paramInt3++;
/* 1791 */             paramInt1 += j;
/* 1792 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1793 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1795 */             paramInt3++;
/* 1796 */             paramInt1 += j;
/* 1797 */             n = i2;
/* 1798 */             i1 = i3;
/* 1799 */             paramInt8 += paramInt11;
/* 1800 */             paramInt9 += paramInt12;
/* 1801 */             paramInt10 += paramInt13;
/* 1802 */             i4 = paramInt10 >> 14;
/* 1803 */             if (i4 != 0) {
/* 1804 */               i2 = paramInt8 / i4;
/* 1805 */               i3 = paramInt9 / i4;
/* 1806 */               if (i2 < 0) i2 = 0;
/* 1807 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1810 */               i2 = 0;
/* 1811 */               i3 = 0;
/*      */             }
/* 1813 */             paramInt1 = (n << 18) + i1;
/* 1814 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1815 */             paramInt6 += paramInt7;
/* 1816 */             i = paramInt6 >> 8;
/* 1817 */             m--; } while (m > 0);
/*      */         }
/* 1819 */         m = paramInt5 - paramInt4 & 0x7;
/* 1820 */         if (m > 0)
/*      */           do {
/* 1822 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1823 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1825 */             paramInt3++;
/* 1826 */             paramInt1 += j;
/* 1827 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static int bb(int paramInt, double paramDouble)
/*      */   {
/*  155 */     double d1 = (paramInt >> 16) / 256.0D;
/*  156 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/*  157 */     double d3 = (paramInt & 0xFF) / 256.0D;
/*  158 */     d1 = Math.pow(d1, paramDouble);
/*  159 */     d2 = Math.pow(d2, paramDouble);
/*  160 */     d3 = Math.pow(d3, paramDouble);
/*  161 */     int i = (int)(d1 * 256.0D);
/*  162 */     int j = (int)(d2 * 256.0D);
/*  163 */     int m = (int)(d3 * 256.0D);
/*  164 */     return (i << 16) + (j << 8) + m;
/*      */   }
/*      */ 
/*      */   static final void dl(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 2316 */     if (u) {
/* 2317 */       if (paramInt5 > x) paramInt5 = x;
/* 2318 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 2320 */     if (paramInt4 >= paramInt5) return;
/* 2321 */     paramInt3 += paramInt4;
/* 2322 */     paramInt6 += paramInt7 * paramInt4;
/* 2323 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 2324 */     if (w)
/*      */     {
/* 2331 */       i5 = paramInt4 - a;
/* 2332 */       paramInt8 += paramInt11 * i5;
/* 2333 */       paramInt9 += paramInt12 * i5;
/* 2334 */       paramInt10 += paramInt13 * i5;
/* 2335 */       i4 = paramInt10 >> 12;
/* 2336 */       if (i4 != 0) {
/* 2337 */         n = paramInt8 / i4;
/* 2338 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2341 */         n = 0;
/* 2342 */         i1 = 0;
/*      */       }
/* 2344 */       paramInt8 += paramInt11 * m;
/* 2345 */       paramInt9 += paramInt12 * m;
/* 2346 */       paramInt10 += paramInt13 * m;
/* 2347 */       i4 = paramInt10 >> 12;
/* 2348 */       if (i4 != 0) {
/* 2349 */         i2 = paramInt8 / i4;
/* 2350 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2353 */         i2 = 0;
/* 2354 */         i3 = 0;
/*      */       }
/* 2356 */       paramInt1 = (n << 20) + i1;
/* 2357 */       j = ((i2 - n) / m << 20) + (i3 - i1) / m;
/* 2358 */       m >>= 3;
/* 2359 */       paramInt7 <<= 3;
/* 2360 */       i = paramInt6 >> 8;
/*      */ 
/* 2362 */       if (v) {
/* 2363 */         if (m > 0) {
/*      */           do {
/* 2365 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2366 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2367 */             paramInt1 += j;
/* 2368 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2369 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2370 */             paramInt1 += j;
/* 2371 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2372 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2373 */             paramInt1 += j;
/* 2374 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2375 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2376 */             paramInt1 += j;
/* 2377 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2378 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2379 */             paramInt1 += j;
/* 2380 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2381 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2382 */             paramInt1 += j;
/* 2383 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2384 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2385 */             paramInt1 += j;
/* 2386 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2387 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2388 */             paramInt1 += j;
/* 2389 */             paramInt6 += paramInt7;
/* 2390 */             i = paramInt6 >> 8;
/* 2391 */             m--; } while (m > 0);
/*      */         }
/* 2393 */         m = paramInt5 - paramInt4 & 0x7;
/* 2394 */         if (m > 0)
/*      */           do {
/* 2396 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2397 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2398 */             paramInt1 += j;
/* 2399 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2403 */         if (m > 0) {
/*      */           do {
/* 2405 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2406 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2408 */             paramInt3++;
/* 2409 */             paramInt1 += j;
/* 2410 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2411 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2413 */             paramInt3++;
/* 2414 */             paramInt1 += j;
/* 2415 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2416 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2418 */             paramInt3++;
/* 2419 */             paramInt1 += j;
/* 2420 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2421 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2423 */             paramInt3++;
/* 2424 */             paramInt1 += j;
/* 2425 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2426 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2428 */             paramInt3++;
/* 2429 */             paramInt1 += j;
/* 2430 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2431 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2433 */             paramInt3++;
/* 2434 */             paramInt1 += j;
/* 2435 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2436 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2438 */             paramInt3++;
/* 2439 */             paramInt1 += j;
/* 2440 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2441 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2443 */             paramInt3++;
/* 2444 */             paramInt1 += j;
/* 2445 */             paramInt6 += paramInt7;
/* 2446 */             i = paramInt6 >> 8;
/* 2447 */             m--; } while (m > 0);
/*      */         }
/* 2449 */         m = paramInt5 - paramInt4 & 0x7;
/* 2450 */         if (m > 0) {
/*      */           do {
/* 2452 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2453 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2455 */             paramInt3++;
/* 2456 */             paramInt1 += j;
/* 2457 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 2468 */       i5 = paramInt4 - a;
/* 2469 */       paramInt8 += paramInt11 * i5;
/* 2470 */       paramInt9 += paramInt12 * i5;
/* 2471 */       paramInt10 += paramInt13 * i5;
/* 2472 */       i4 = paramInt10 >> 14;
/* 2473 */       if (i4 != 0) {
/* 2474 */         n = paramInt8 / i4;
/* 2475 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2478 */         n = 0;
/* 2479 */         i1 = 0;
/*      */       }
/* 2481 */       paramInt8 += paramInt11 * m;
/* 2482 */       paramInt9 += paramInt12 * m;
/* 2483 */       paramInt10 += paramInt13 * m;
/* 2484 */       i4 = paramInt10 >> 14;
/* 2485 */       if (i4 != 0) {
/* 2486 */         i2 = paramInt8 / i4;
/* 2487 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2490 */         i2 = 0;
/* 2491 */         i3 = 0;
/*      */       }
/* 2493 */       paramInt1 = (n << 18) + i1;
/* 2494 */       j = ((i2 - n) / m << 18) + (i3 - i1) / m;
/* 2495 */       m >>= 3;
/* 2496 */       paramInt7 <<= 3;
/* 2497 */       i = paramInt6 >> 8;
/*      */ 
/* 2499 */       if (v) {
/* 2500 */         if (m > 0) {
/*      */           do {
/* 2502 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2503 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2504 */             paramInt1 += j;
/* 2505 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2506 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2507 */             paramInt1 += j;
/* 2508 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2509 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2510 */             paramInt1 += j;
/* 2511 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2512 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2513 */             paramInt1 += j;
/* 2514 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2515 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2516 */             paramInt1 += j;
/* 2517 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2518 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2519 */             paramInt1 += j;
/* 2520 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2521 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2522 */             paramInt1 += j;
/* 2523 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2524 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2525 */             paramInt1 += j;
/* 2526 */             paramInt6 += paramInt7;
/* 2527 */             i = paramInt6 >> 8;
/* 2528 */             m--; } while (m > 0);
/*      */         }
/* 2530 */         m = paramInt5 - paramInt4 & 0x7;
/* 2531 */         if (m > 0)
/*      */           do {
/* 2533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2535 */             paramInt1 += j;
/* 2536 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2540 */         if (m > 0) {
/*      */           do {
/* 2542 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2543 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2545 */             paramInt3++;
/* 2546 */             paramInt1 += j;
/* 2547 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2548 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2550 */             paramInt3++;
/* 2551 */             paramInt1 += j;
/* 2552 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2553 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2555 */             paramInt3++;
/* 2556 */             paramInt1 += j;
/* 2557 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2558 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2560 */             paramInt3++;
/* 2561 */             paramInt1 += j;
/* 2562 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2563 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2565 */             paramInt3++;
/* 2566 */             paramInt1 += j;
/* 2567 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2568 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2570 */             paramInt3++;
/* 2571 */             paramInt1 += j;
/* 2572 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2573 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2575 */             paramInt3++;
/* 2576 */             paramInt1 += j;
/* 2577 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2578 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2580 */             paramInt3++;
/* 2581 */             paramInt1 += j;
/* 2582 */             paramInt6 += paramInt7;
/* 2583 */             i = paramInt6 >> 8;
/* 2584 */             m--; } while (m > 0);
/*      */         }
/* 2586 */         m = paramInt5 - paramInt4 & 0x7;
/* 2587 */         if (m > 0)
/*      */           do {
/* 2589 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2590 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2592 */             paramInt3++;
/* 2593 */             paramInt1 += j;
/* 2594 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void be()
/*      */   {
/*   81 */     a = x / 2;
/*   82 */     h = p / 2;
/*   83 */     ad = -a;
/*   84 */     ac = x - a;
/*   85 */     aa = -h;
/*   86 */     as = p - h;
/*      */   }
/*      */ 
/*      */   static final void dz(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*  172 */     int i = paramInt5 - paramInt4;
/*  173 */     int j = paramInt2 - paramInt1;
/*  174 */     int m = paramInt6 - paramInt4;
/*  175 */     int n = paramInt3 - paramInt1;
/*  176 */     int i1 = paramInt8 - paramInt7;
/*  177 */     int i2 = paramInt9 - paramInt7;
/*      */     int i3;
/*  179 */     if (paramInt3 != paramInt2) i3 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2); else
/*  180 */       i3 = 0;
/*  182 */     int i4;
/*  182 */     if (paramInt2 != paramInt1) i4 = (i << 16) / j; else
/*  183 */       i4 = 0;
/*  185 */     int i5;
/*  185 */     if (paramInt3 != paramInt1) i5 = (m << 16) / n; else
/*  186 */       i5 = 0;
/*  187 */     int i6 = i * n - m * j;
/*  188 */     if (i6 == 0) return;
/*  189 */     int i7 = (i1 * n - i2 * j << 8) / i6;
/*  190 */     int i8 = (i2 * i - i1 * m << 8) / i6;
/*  191 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  192 */       if (paramInt1 >= p) return;
/*  193 */       if (paramInt2 > p) paramInt2 = p;
/*  194 */       if (paramInt3 > p) paramInt3 = p;
/*  195 */       paramInt7 = (paramInt7 << 8) - i7 * paramInt4 + i7;
/*  196 */       if (paramInt2 < paramInt3) {
/*  197 */         paramInt6 = paramInt4 <<= 16;
/*  198 */         if (paramInt1 < 0) {
/*  199 */           paramInt6 -= i5 * paramInt1;
/*  200 */           paramInt4 -= i4 * paramInt1;
/*  201 */           paramInt7 -= i8 * paramInt1;
/*  202 */           paramInt1 = 0;
/*      */         }
/*  204 */         paramInt5 <<= 16;
/*  205 */         if (paramInt2 < 0) {
/*  206 */           paramInt5 -= i3 * paramInt2;
/*  207 */           paramInt2 = 0;
/*      */         }
/*  209 */         if (((paramInt1 != paramInt2) && (i5 < i4)) || ((paramInt1 == paramInt2) && (i5 > i3))) {
/*  210 */           paramInt3 -= paramInt2;
/*  211 */           paramInt2 -= paramInt1;
/*  212 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  214 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  215 */             paramInt6 += i5;
/*  216 */             paramInt4 += i4;
/*  217 */             paramInt7 += i8;
/*  218 */             paramInt1 += j; }
/*      */           while (true) {
/*  220 */             paramInt3--; if (paramInt3 < 0) break;
/*  221 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  222 */             paramInt6 += i5;
/*  223 */             paramInt5 += i3;
/*  224 */             paramInt7 += i8;
/*  225 */             paramInt1 += j;
/*      */           }
/*  227 */           return;
/*      */         }
/*      */ 
/*  230 */         paramInt3 -= paramInt2;
/*  231 */         paramInt2 -= paramInt1;
/*  232 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  234 */           cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  235 */           paramInt6 += i5;
/*  236 */           paramInt4 += i4;
/*  237 */           paramInt7 += i8;
/*  238 */           paramInt1 += j; }
/*      */         while (true) {
/*  240 */           paramInt3--; if (paramInt3 < 0) break;
/*  241 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  242 */           paramInt6 += i5;
/*  243 */           paramInt5 += i3;
/*  244 */           paramInt7 += i8;
/*  245 */           paramInt1 += j;
/*      */         }
/*  247 */         return;
/*      */       }
/*      */ 
/*  251 */       paramInt5 = paramInt4 <<= 16;
/*  252 */       if (paramInt1 < 0) {
/*  253 */         paramInt5 -= i5 * paramInt1;
/*  254 */         paramInt4 -= i4 * paramInt1;
/*  255 */         paramInt7 -= i8 * paramInt1;
/*  256 */         paramInt1 = 0;
/*      */       }
/*  258 */       paramInt6 <<= 16;
/*  259 */       if (paramInt3 < 0) {
/*  260 */         paramInt6 -= i3 * paramInt3;
/*  261 */         paramInt3 = 0;
/*      */       }
/*  263 */       if (((paramInt1 != paramInt3) && (i5 < i4)) || ((paramInt1 == paramInt3) && (i3 > i4))) {
/*  264 */         paramInt2 -= paramInt3;
/*  265 */         paramInt3 -= paramInt1;
/*  266 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  268 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  269 */           paramInt5 += i5;
/*  270 */           paramInt4 += i4;
/*  271 */           paramInt7 += i8;
/*  272 */           paramInt1 += j; }
/*      */         while (true) {
/*  274 */           paramInt2--; if (paramInt2 < 0) break;
/*  275 */           cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  276 */           paramInt6 += i3;
/*  277 */           paramInt4 += i4;
/*  278 */           paramInt7 += i8;
/*  279 */           paramInt1 += j;
/*      */         }
/*  281 */         return;
/*      */       }
/*      */ 
/*  284 */       paramInt2 -= paramInt3;
/*  285 */       paramInt3 -= paramInt1;
/*  286 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  288 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  289 */         paramInt5 += i5;
/*  290 */         paramInt4 += i4;
/*  291 */         paramInt7 += i8;
/*  292 */         paramInt1 += j; }
/*      */       while (true) {
/*  294 */         paramInt2--; if (paramInt2 < 0) break;
/*  295 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  296 */         paramInt6 += i3;
/*  297 */         paramInt4 += i4;
/*  298 */         paramInt7 += i8;
/*  299 */         paramInt1 += j;
/*      */       }
/*  301 */       return;
/*      */     }
/*      */ 
/*  305 */     if (paramInt2 <= paramInt3) {
/*  306 */       if (paramInt2 >= p) return;
/*  307 */       if (paramInt3 > p) paramInt3 = p;
/*  308 */       if (paramInt1 > p) paramInt1 = p;
/*  309 */       paramInt8 = (paramInt8 << 8) - i7 * paramInt5 + i7;
/*  310 */       if (paramInt3 < paramInt1) {
/*  311 */         paramInt4 = paramInt5 <<= 16;
/*  312 */         if (paramInt2 < 0) {
/*  313 */           paramInt4 -= i4 * paramInt2;
/*  314 */           paramInt5 -= i3 * paramInt2;
/*  315 */           paramInt8 -= i8 * paramInt2;
/*  316 */           paramInt2 = 0;
/*      */         }
/*  318 */         paramInt6 <<= 16;
/*  319 */         if (paramInt3 < 0) {
/*  320 */           paramInt6 -= i5 * paramInt3;
/*  321 */           paramInt3 = 0;
/*      */         }
/*  323 */         if (((paramInt2 != paramInt3) && (i4 < i3)) || ((paramInt2 == paramInt3) && (i4 > i5))) {
/*  324 */           paramInt1 -= paramInt3;
/*  325 */           paramInt3 -= paramInt2;
/*  326 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  328 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  329 */             paramInt4 += i4;
/*  330 */             paramInt5 += i3;
/*  331 */             paramInt8 += i8;
/*  332 */             paramInt2 += j; }
/*      */           while (true) {
/*  334 */             paramInt1--; if (paramInt1 < 0) break;
/*  335 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  336 */             paramInt4 += i4;
/*  337 */             paramInt6 += i5;
/*  338 */             paramInt8 += i8;
/*  339 */             paramInt2 += j;
/*      */           }
/*  341 */           return;
/*      */         }
/*      */ 
/*  344 */         paramInt1 -= paramInt3;
/*  345 */         paramInt3 -= paramInt2;
/*  346 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  348 */           cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  349 */           paramInt4 += i4;
/*  350 */           paramInt5 += i3;
/*  351 */           paramInt8 += i8;
/*  352 */           paramInt2 += j; }
/*      */         while (true) {
/*  354 */           paramInt1--; if (paramInt1 < 0) break;
/*  355 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  356 */           paramInt4 += i4;
/*  357 */           paramInt6 += i5;
/*  358 */           paramInt8 += i8;
/*  359 */           paramInt2 += j;
/*      */         }
/*  361 */         return;
/*      */       }
/*      */ 
/*  365 */       paramInt6 = paramInt5 <<= 16;
/*  366 */       if (paramInt2 < 0) {
/*  367 */         paramInt6 -= i4 * paramInt2;
/*  368 */         paramInt5 -= i3 * paramInt2;
/*  369 */         paramInt8 -= i8 * paramInt2;
/*  370 */         paramInt2 = 0;
/*      */       }
/*  372 */       paramInt4 <<= 16;
/*  373 */       if (paramInt1 < 0) {
/*  374 */         paramInt4 -= i5 * paramInt1;
/*  375 */         paramInt1 = 0;
/*      */       }
/*  377 */       if (i4 < i3) {
/*  378 */         paramInt3 -= paramInt1;
/*  379 */         paramInt1 -= paramInt2;
/*  380 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  382 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  383 */           paramInt6 += i4;
/*  384 */           paramInt5 += i3;
/*  385 */           paramInt8 += i8;
/*  386 */           paramInt2 += j; }
/*      */         while (true) {
/*  388 */           paramInt3--; if (paramInt3 < 0) break;
/*  389 */           cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  390 */           paramInt4 += i5;
/*  391 */           paramInt5 += i3;
/*  392 */           paramInt8 += i8;
/*  393 */           paramInt2 += j;
/*      */         }
/*  395 */         return;
/*      */       }
/*      */ 
/*  398 */       paramInt3 -= paramInt1;
/*  399 */       paramInt1 -= paramInt2;
/*  400 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  402 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  403 */         paramInt6 += i4;
/*  404 */         paramInt5 += i3;
/*  405 */         paramInt8 += i8;
/*  406 */         paramInt2 += j; }
/*      */       while (true) {
/*  408 */         paramInt3--; if (paramInt3 < 0) break;
/*  409 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  410 */         paramInt4 += i5;
/*  411 */         paramInt5 += i3;
/*  412 */         paramInt8 += i8;
/*  413 */         paramInt2 += j;
/*      */       }
/*  415 */       return;
/*      */     }
/*      */ 
/*  420 */     if (paramInt3 >= p) return;
/*  421 */     if (paramInt1 > p) paramInt1 = p;
/*  422 */     if (paramInt2 > p) paramInt2 = p;
/*  423 */     paramInt9 = (paramInt9 << 8) - i7 * paramInt6 + i7;
/*  424 */     if (paramInt1 < paramInt2) {
/*  425 */       paramInt5 = paramInt6 <<= 16;
/*  426 */       if (paramInt3 < 0) {
/*  427 */         paramInt5 -= i3 * paramInt3;
/*  428 */         paramInt6 -= i5 * paramInt3;
/*  429 */         paramInt9 -= i8 * paramInt3;
/*  430 */         paramInt3 = 0;
/*      */       }
/*  432 */       paramInt4 <<= 16;
/*  433 */       if (paramInt1 < 0) {
/*  434 */         paramInt4 -= i4 * paramInt1;
/*  435 */         paramInt1 = 0;
/*      */       }
/*  437 */       if (i3 < i5) {
/*  438 */         paramInt2 -= paramInt1;
/*  439 */         paramInt1 -= paramInt3;
/*  440 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  442 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  443 */           paramInt5 += i3;
/*  444 */           paramInt6 += i5;
/*  445 */           paramInt9 += i8;
/*  446 */           paramInt3 += j; }
/*      */         while (true) {
/*  448 */           paramInt2--; if (paramInt2 < 0) break;
/*  449 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  450 */           paramInt5 += i3;
/*  451 */           paramInt4 += i4;
/*  452 */           paramInt9 += i8;
/*  453 */           paramInt3 += j;
/*      */         }
/*  455 */         return;
/*      */       }
/*      */ 
/*  458 */       paramInt2 -= paramInt1;
/*  459 */       paramInt1 -= paramInt3;
/*  460 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  462 */         cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  463 */         paramInt5 += i3;
/*  464 */         paramInt6 += i5;
/*  465 */         paramInt9 += i8;
/*  466 */         paramInt3 += j; }
/*      */       while (true) {
/*  468 */         paramInt2--; if (paramInt2 < 0) break;
/*  469 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  470 */         paramInt5 += i3;
/*  471 */         paramInt4 += i4;
/*  472 */         paramInt9 += i8;
/*  473 */         paramInt3 += j;
/*      */       }
/*  475 */       return;
/*      */     }
/*      */ 
/*  479 */     paramInt4 = paramInt6 <<= 16;
/*  480 */     if (paramInt3 < 0) {
/*  481 */       paramInt4 -= i3 * paramInt3;
/*  482 */       paramInt6 -= i5 * paramInt3;
/*  483 */       paramInt9 -= i8 * paramInt3;
/*  484 */       paramInt3 = 0;
/*      */     }
/*  486 */     paramInt5 <<= 16;
/*  487 */     if (paramInt2 < 0) {
/*  488 */       paramInt5 -= i4 * paramInt2;
/*  489 */       paramInt2 = 0;
/*      */     }
/*  491 */     if (i3 < i5) {
/*  492 */       paramInt1 -= paramInt2;
/*  493 */       paramInt2 -= paramInt3;
/*  494 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  496 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  497 */         paramInt4 += i3;
/*  498 */         paramInt6 += i5;
/*  499 */         paramInt9 += i8;
/*  500 */         paramInt3 += j; }
/*      */       while (true) {
/*  502 */         paramInt1--; if (paramInt1 < 0) break;
/*  503 */         cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  504 */         paramInt5 += i4;
/*  505 */         paramInt6 += i5;
/*  506 */         paramInt9 += i8;
/*  507 */         paramInt3 += j;
/*      */       }
/*  509 */       return;
/*      */     }
/*      */ 
/*  512 */     paramInt1 -= paramInt2;
/*  513 */     paramInt2 -= paramInt3;
/*  514 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  516 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  517 */       paramInt4 += i3;
/*  518 */       paramInt6 += i5;
/*  519 */       paramInt9 += i8;
/*  520 */       paramInt3 += j; }
/*      */     while (true) {
/*  522 */       paramInt1--; if (paramInt1 < 0) break;
/*  523 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  524 */       paramInt5 += i4;
/*  525 */       paramInt6 += i5;
/*  526 */       paramInt9 += i8;
/*  527 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void ba(aw paramaw)
/*      */   {
/*  102 */     av = paramaw;
/*      */   }
/*      */ 
/*      */   public static final void bc(double paramDouble) {
/*  106 */     br(paramDouble, 0, 512);
/*      */   }
/*      */ 
/*      */   static final void br(double paramDouble, int paramInt1, int paramInt2) {
/*  110 */     paramDouble += Math.random() * 0.03D - 0.015D;
/*  111 */     int i = paramInt1 * 128;
/*  112 */     for (int j = paramInt1; j < paramInt2; j++) {
/*  113 */       double d1 = (j >> 3) / 64.0D + 0.0078125D;
/*  114 */       double d2 = (j & 0x7) / 8.0D + 0.0625D;
/*  115 */       for (int m = 0; m < 128; m++) {
/*  116 */         double d3 = m / 128.0D;
/*  117 */         double d4 = d3;
/*  118 */         double d5 = d3;
/*  119 */         double d6 = d3;
/*  120 */         if (d2 != 0.0D)
/*      */         {
/*  122 */           double d7;
/*  122 */           if (d3 < 0.5D) d7 = d3 * (1.0D + d2); else
/*  123 */             d7 = d3 + d2 - d3 * d2;
/*  124 */           double d8 = 2.0D * d3 - d7;
/*  125 */           double d9 = d1 + 0.3333333333333333D;
/*  126 */           if (d9 > 1.0D) d9 -= 1.0D;
/*  127 */           double d10 = d1;
/*  128 */           double d11 = d1 - 0.3333333333333333D;
/*  129 */           if (d11 < 0.0D) d11 += 1.0D;
/*  130 */           if (6.0D * d9 < 1.0D) d4 = d8 + (d7 - d8) * 6.0D * d9;
/*  131 */           else if (2.0D * d9 < 1.0D) d4 = d7;
/*  132 */           else if (3.0D * d9 < 2.0D) d4 = d8 + (d7 - d8) * (0.6666666666666666D - d9) * 6.0D; else
/*  133 */             d4 = d8;
/*  134 */           if (6.0D * d10 < 1.0D) d5 = d8 + (d7 - d8) * 6.0D * d10;
/*  135 */           else if (2.0D * d10 < 1.0D) d5 = d7;
/*  136 */           else if (3.0D * d10 < 2.0D) d5 = d8 + (d7 - d8) * (0.6666666666666666D - d10) * 6.0D; else
/*  137 */             d5 = d8;
/*  138 */           if (6.0D * d11 < 1.0D) d6 = d8 + (d7 - d8) * 6.0D * d11;
/*  139 */           else if (2.0D * d11 < 1.0D) d6 = d7;
/*  140 */           else if (3.0D * d11 < 2.0D) d6 = d8 + (d7 - d8) * (0.6666666666666666D - d11) * 6.0D; else
/*  141 */             d6 = d8;
/*      */         }
/*  143 */         int n = (int)(d4 * 256.0D);
/*  144 */         int i1 = (int)(d5 * 256.0D);
/*  145 */         int i2 = (int)(d6 * 256.0D);
/*  146 */         int i3 = (n << 16) + (i1 << 8) + i2;
/*  147 */         i3 = bb(i3, paramDouble);
/*  148 */         if (i3 == 0) i3 = 1;
/*  149 */         ap[(i++)] = i3;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void cx(double paramDouble)
/*      */   {
/*  106 */     br(paramDouble, 0, 512);
/*      */   }
/*      */ 
/*      */   public static void bd(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  168 */     u = (paramInt1 < 0) || (paramInt1 > x) || (paramInt2 < 0) || (paramInt2 > x) || (paramInt3 < 0) || (paramInt3 > x);
/*      */   }
/*      */ 
/*      */   public static final void dc(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  619 */     int i = 0;
/*  620 */     if (paramInt2 != paramInt1) i = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/*  621 */     int j = 0;
/*  622 */     if (paramInt3 != paramInt2) j = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/*  623 */     int m = 0;
/*  624 */     if (paramInt3 != paramInt1) m = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/*  625 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  626 */       if (paramInt1 >= p) return;
/*  627 */       if (paramInt2 > p) paramInt2 = p;
/*  628 */       if (paramInt3 > p) paramInt3 = p;
/*  629 */       if (paramInt2 < paramInt3) {
/*  630 */         paramInt6 = paramInt4 <<= 16;
/*  631 */         if (paramInt1 < 0) {
/*  632 */           paramInt6 -= m * paramInt1;
/*  633 */           paramInt4 -= i * paramInt1;
/*  634 */           paramInt1 = 0;
/*      */         }
/*  636 */         paramInt5 <<= 16;
/*  637 */         if (paramInt2 < 0) {
/*  638 */           paramInt5 -= j * paramInt2;
/*  639 */           paramInt2 = 0;
/*      */         }
/*  641 */         if (((paramInt1 != paramInt2) && (m < i)) || ((paramInt1 == paramInt2) && (m > j))) {
/*  642 */           paramInt3 -= paramInt2;
/*  643 */           paramInt2 -= paramInt1;
/*  644 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  646 */             cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  647 */             paramInt6 += m;
/*  648 */             paramInt4 += i;
/*  649 */             paramInt1 += j; }
/*      */           while (true) {
/*  651 */             paramInt3--; if (paramInt3 < 0) break;
/*  652 */             cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  653 */             paramInt6 += m;
/*  654 */             paramInt5 += j;
/*  655 */             paramInt1 += j;
/*      */           }
/*  657 */           return;
/*      */         }
/*      */ 
/*  660 */         paramInt3 -= paramInt2;
/*  661 */         paramInt2 -= paramInt1;
/*  662 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  664 */           cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  665 */           paramInt6 += m;
/*  666 */           paramInt4 += i;
/*  667 */           paramInt1 += j; }
/*      */         while (true) {
/*  669 */           paramInt3--; if (paramInt3 < 0) break;
/*  670 */           cl(n, paramInt1, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  671 */           paramInt6 += m;
/*  672 */           paramInt5 += j;
/*  673 */           paramInt1 += j;
/*      */         }
/*  675 */         return;
/*      */       }
/*      */ 
/*  679 */       paramInt5 = paramInt4 <<= 16;
/*  680 */       if (paramInt1 < 0) {
/*  681 */         paramInt5 -= m * paramInt1;
/*  682 */         paramInt4 -= i * paramInt1;
/*  683 */         paramInt1 = 0;
/*      */       }
/*  685 */       paramInt6 <<= 16;
/*  686 */       if (paramInt3 < 0) {
/*  687 */         paramInt6 -= j * paramInt3;
/*  688 */         paramInt3 = 0;
/*      */       }
/*  690 */       if (((paramInt1 != paramInt3) && (m < i)) || ((paramInt1 == paramInt3) && (j > i))) {
/*  691 */         paramInt2 -= paramInt3;
/*  692 */         paramInt3 -= paramInt1;
/*  693 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  695 */           cl(n, paramInt1, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  696 */           paramInt5 += m;
/*  697 */           paramInt4 += i;
/*  698 */           paramInt1 += j; }
/*      */         while (true) {
/*  700 */           paramInt2--; if (paramInt2 < 0) break;
/*  701 */           cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  702 */           paramInt6 += j;
/*  703 */           paramInt4 += i;
/*  704 */           paramInt1 += j;
/*      */         }
/*  706 */         return;
/*      */       }
/*      */ 
/*  709 */       paramInt2 -= paramInt3;
/*  710 */       paramInt3 -= paramInt1;
/*  711 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  713 */         cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  714 */         paramInt5 += m;
/*  715 */         paramInt4 += i;
/*  716 */         paramInt1 += j; }
/*      */       while (true) {
/*  718 */         paramInt2--; if (paramInt2 < 0) break;
/*  719 */         cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  720 */         paramInt6 += j;
/*  721 */         paramInt4 += i;
/*  722 */         paramInt1 += j;
/*      */       }
/*  724 */       return;
/*      */     }
/*      */ 
/*  728 */     if (paramInt2 <= paramInt3) {
/*  729 */       if (paramInt2 >= p) return;
/*  730 */       if (paramInt3 > p) paramInt3 = p;
/*  731 */       if (paramInt1 > p) paramInt1 = p;
/*  732 */       if (paramInt3 < paramInt1) {
/*  733 */         paramInt4 = paramInt5 <<= 16;
/*  734 */         if (paramInt2 < 0) {
/*  735 */           paramInt4 -= i * paramInt2;
/*  736 */           paramInt5 -= j * paramInt2;
/*  737 */           paramInt2 = 0;
/*      */         }
/*  739 */         paramInt6 <<= 16;
/*  740 */         if (paramInt3 < 0) {
/*  741 */           paramInt6 -= m * paramInt3;
/*  742 */           paramInt3 = 0;
/*      */         }
/*  744 */         if (((paramInt2 != paramInt3) && (i < j)) || ((paramInt2 == paramInt3) && (i > m))) {
/*  745 */           paramInt1 -= paramInt3;
/*  746 */           paramInt3 -= paramInt2;
/*  747 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  749 */             cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  750 */             paramInt4 += i;
/*  751 */             paramInt5 += j;
/*  752 */             paramInt2 += j; }
/*      */           while (true) {
/*  754 */             paramInt1--; if (paramInt1 < 0) break;
/*  755 */             cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  756 */             paramInt4 += i;
/*  757 */             paramInt6 += m;
/*  758 */             paramInt2 += j;
/*      */           }
/*  760 */           return;
/*      */         }
/*      */ 
/*  763 */         paramInt1 -= paramInt3;
/*  764 */         paramInt3 -= paramInt2;
/*  765 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  767 */           cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  768 */           paramInt4 += i;
/*  769 */           paramInt5 += j;
/*  770 */           paramInt2 += j; }
/*      */         while (true) {
/*  772 */           paramInt1--; if (paramInt1 < 0) break;
/*  773 */           cl(n, paramInt2, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  774 */           paramInt4 += i;
/*  775 */           paramInt6 += m;
/*  776 */           paramInt2 += j;
/*      */         }
/*  778 */         return;
/*      */       }
/*      */ 
/*  782 */       paramInt6 = paramInt5 <<= 16;
/*  783 */       if (paramInt2 < 0) {
/*  784 */         paramInt6 -= i * paramInt2;
/*  785 */         paramInt5 -= j * paramInt2;
/*  786 */         paramInt2 = 0;
/*      */       }
/*  788 */       paramInt4 <<= 16;
/*  789 */       if (paramInt1 < 0) {
/*  790 */         paramInt4 -= m * paramInt1;
/*  791 */         paramInt1 = 0;
/*      */       }
/*  793 */       if (i < j) {
/*  794 */         paramInt3 -= paramInt1;
/*  795 */         paramInt1 -= paramInt2;
/*  796 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  798 */           cl(n, paramInt2, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  799 */           paramInt6 += i;
/*  800 */           paramInt5 += j;
/*  801 */           paramInt2 += j; }
/*      */         while (true) {
/*  803 */           paramInt3--; if (paramInt3 < 0) break;
/*  804 */           cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  805 */           paramInt4 += m;
/*  806 */           paramInt5 += j;
/*  807 */           paramInt2 += j;
/*      */         }
/*  809 */         return;
/*      */       }
/*      */ 
/*  812 */       paramInt3 -= paramInt1;
/*  813 */       paramInt1 -= paramInt2;
/*  814 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  816 */         cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  817 */         paramInt6 += i;
/*  818 */         paramInt5 += j;
/*  819 */         paramInt2 += j; }
/*      */       while (true) {
/*  821 */         paramInt3--; if (paramInt3 < 0) break;
/*  822 */         cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  823 */         paramInt4 += m;
/*  824 */         paramInt5 += j;
/*  825 */         paramInt2 += j;
/*      */       }
/*  827 */       return;
/*      */     }
/*      */ 
/*  832 */     if (paramInt3 >= p) return;
/*  833 */     if (paramInt1 > p) paramInt1 = p;
/*  834 */     if (paramInt2 > p) paramInt2 = p;
/*  835 */     if (paramInt1 < paramInt2) {
/*  836 */       paramInt5 = paramInt6 <<= 16;
/*  837 */       if (paramInt3 < 0) {
/*  838 */         paramInt5 -= j * paramInt3;
/*  839 */         paramInt6 -= m * paramInt3;
/*  840 */         paramInt3 = 0;
/*      */       }
/*  842 */       paramInt4 <<= 16;
/*  843 */       if (paramInt1 < 0) {
/*  844 */         paramInt4 -= i * paramInt1;
/*  845 */         paramInt1 = 0;
/*      */       }
/*  847 */       if (j < m) {
/*  848 */         paramInt2 -= paramInt1;
/*  849 */         paramInt1 -= paramInt3;
/*  850 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  852 */           cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  853 */           paramInt5 += j;
/*  854 */           paramInt6 += m;
/*  855 */           paramInt3 += j; }
/*      */         while (true) {
/*  857 */           paramInt2--; if (paramInt2 < 0) break;
/*  858 */           cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  859 */           paramInt5 += j;
/*  860 */           paramInt4 += i;
/*  861 */           paramInt3 += j;
/*      */         }
/*  863 */         return;
/*      */       }
/*      */ 
/*  866 */       paramInt2 -= paramInt1;
/*  867 */       paramInt1 -= paramInt3;
/*  868 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  870 */         cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  871 */         paramInt5 += j;
/*  872 */         paramInt6 += m;
/*  873 */         paramInt3 += j; }
/*      */       while (true) {
/*  875 */         paramInt2--; if (paramInt2 < 0) break;
/*  876 */         cl(n, paramInt3, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  877 */         paramInt5 += j;
/*  878 */         paramInt4 += i;
/*  879 */         paramInt3 += j;
/*      */       }
/*  881 */       return;
/*      */     }
/*      */ 
/*  885 */     paramInt4 = paramInt6 <<= 16;
/*  886 */     if (paramInt3 < 0) {
/*  887 */       paramInt4 -= j * paramInt3;
/*  888 */       paramInt6 -= m * paramInt3;
/*  889 */       paramInt3 = 0;
/*      */     }
/*  891 */     paramInt5 <<= 16;
/*  892 */     if (paramInt2 < 0) {
/*  893 */       paramInt5 -= i * paramInt2;
/*  894 */       paramInt2 = 0;
/*      */     }
/*  896 */     if (j < m) {
/*  897 */       paramInt1 -= paramInt2;
/*  898 */       paramInt2 -= paramInt3;
/*  899 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  901 */         cl(n, paramInt3, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  902 */         paramInt4 += j;
/*  903 */         paramInt6 += m;
/*  904 */         paramInt3 += j; }
/*      */       while (true) {
/*  906 */         paramInt1--; if (paramInt1 < 0) break;
/*  907 */         cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  908 */         paramInt5 += i;
/*  909 */         paramInt6 += m;
/*  910 */         paramInt3 += j;
/*      */       }
/*  912 */       return;
/*      */     }
/*      */ 
/*  915 */     paramInt1 -= paramInt2;
/*  916 */     paramInt2 -= paramInt3;
/*  917 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  919 */       cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  920 */       paramInt4 += j;
/*  921 */       paramInt6 += m;
/*  922 */       paramInt3 += j; }
/*      */     while (true) {
/*  924 */       paramInt1--; if (paramInt1 < 0) break;
/*  925 */       cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  926 */       paramInt5 += i;
/*  927 */       paramInt6 += m;
/*  928 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void cs(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  536 */     if (u) {
/*  537 */       if (paramInt5 > x) paramInt5 = x;
/*  538 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  540 */     if (paramInt4 >= paramInt5) return;
/*  541 */     paramInt1 += paramInt4;
/*  542 */     paramInt6 += paramInt7 * paramInt4;
/*      */     int i;
/*      */     int j;
/*      */     int m;
/*  543 */     if (e) {
/*  544 */       paramInt3 = paramInt5 - paramInt4 >> 2;
/*  545 */       paramInt7 <<= 2;
/*  546 */       if (b == 0) {
/*  547 */         if (paramInt3 > 0) {
/*      */           do {
/*  549 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  550 */             paramInt6 += paramInt7;
/*  551 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  552 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  553 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  554 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  555 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  557 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  558 */         if (paramInt3 > 0) {
/*  559 */           paramInt2 = ap[(paramInt6 >> 8)];
/*      */           do {
/*  561 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  562 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*      */       else {
/*  566 */         i = b;
/*  567 */         j = 256 - b;
/*  568 */         if (paramInt3 > 0) {
/*      */           do {
/*  570 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  571 */             paramInt6 += paramInt7;
/*  572 */             paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  573 */             m = paramArrayOfInt[paramInt1];
/*  574 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  575 */             m = paramArrayOfInt[paramInt1];
/*  576 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  577 */             m = paramArrayOfInt[paramInt1];
/*  578 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  579 */             m = paramArrayOfInt[paramInt1];
/*  580 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  581 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  583 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  584 */         if (paramInt3 > 0) {
/*  585 */           paramInt2 = ap[(paramInt6 >> 8)];
/*  586 */           paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */           do {
/*  588 */             m = paramArrayOfInt[paramInt1];
/*  589 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  590 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*  593 */       return;
/*      */     }
/*      */ 
/*  596 */     paramInt3 = paramInt5 - paramInt4;
/*  597 */     if (b == 0) {
/*      */       do {
/*  599 */         paramArrayOfInt[(paramInt1++)] = ap[(paramInt6 >> 8)];
/*  600 */         paramInt6 += paramInt7;
/*  601 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */     else {
/*  604 */       i = b;
/*  605 */       j = 256 - b;
/*      */       do {
/*  607 */         paramInt2 = ap[(paramInt6 >> 8)];
/*  608 */         paramInt6 += paramInt7;
/*  609 */         paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  610 */         m = paramArrayOfInt[paramInt1];
/*  611 */         paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  612 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void cj(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  619 */     int i = 0;
/*  620 */     if (paramInt2 != paramInt1) i = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/*  621 */     int j = 0;
/*  622 */     if (paramInt3 != paramInt2) j = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/*  623 */     int m = 0;
/*  624 */     if (paramInt3 != paramInt1) m = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/*  625 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  626 */       if (paramInt1 >= p) return;
/*  627 */       if (paramInt2 > p) paramInt2 = p;
/*  628 */       if (paramInt3 > p) paramInt3 = p;
/*  629 */       if (paramInt2 < paramInt3) {
/*  630 */         paramInt6 = paramInt4 <<= 16;
/*  631 */         if (paramInt1 < 0) {
/*  632 */           paramInt6 -= m * paramInt1;
/*  633 */           paramInt4 -= i * paramInt1;
/*  634 */           paramInt1 = 0;
/*      */         }
/*  636 */         paramInt5 <<= 16;
/*  637 */         if (paramInt2 < 0) {
/*  638 */           paramInt5 -= j * paramInt2;
/*  639 */           paramInt2 = 0;
/*      */         }
/*  641 */         if (((paramInt1 != paramInt2) && (m < i)) || ((paramInt1 == paramInt2) && (m > j))) {
/*  642 */           paramInt3 -= paramInt2;
/*  643 */           paramInt2 -= paramInt1;
/*  644 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  646 */             cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  647 */             paramInt6 += m;
/*  648 */             paramInt4 += i;
/*  649 */             paramInt1 += j; }
/*      */           while (true) {
/*  651 */             paramInt3--; if (paramInt3 < 0) break;
/*  652 */             cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  653 */             paramInt6 += m;
/*  654 */             paramInt5 += j;
/*  655 */             paramInt1 += j;
/*      */           }
/*  657 */           return;
/*      */         }
/*      */ 
/*  660 */         paramInt3 -= paramInt2;
/*  661 */         paramInt2 -= paramInt1;
/*  662 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  664 */           cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  665 */           paramInt6 += m;
/*  666 */           paramInt4 += i;
/*  667 */           paramInt1 += j; }
/*      */         while (true) {
/*  669 */           paramInt3--; if (paramInt3 < 0) break;
/*  670 */           cl(n, paramInt1, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  671 */           paramInt6 += m;
/*  672 */           paramInt5 += j;
/*  673 */           paramInt1 += j;
/*      */         }
/*  675 */         return;
/*      */       }
/*      */ 
/*  679 */       paramInt5 = paramInt4 <<= 16;
/*  680 */       if (paramInt1 < 0) {
/*  681 */         paramInt5 -= m * paramInt1;
/*  682 */         paramInt4 -= i * paramInt1;
/*  683 */         paramInt1 = 0;
/*      */       }
/*  685 */       paramInt6 <<= 16;
/*  686 */       if (paramInt3 < 0) {
/*  687 */         paramInt6 -= j * paramInt3;
/*  688 */         paramInt3 = 0;
/*      */       }
/*  690 */       if (((paramInt1 != paramInt3) && (m < i)) || ((paramInt1 == paramInt3) && (j > i))) {
/*  691 */         paramInt2 -= paramInt3;
/*  692 */         paramInt3 -= paramInt1;
/*  693 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  695 */           cl(n, paramInt1, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  696 */           paramInt5 += m;
/*  697 */           paramInt4 += i;
/*  698 */           paramInt1 += j; }
/*      */         while (true) {
/*  700 */           paramInt2--; if (paramInt2 < 0) break;
/*  701 */           cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  702 */           paramInt6 += j;
/*  703 */           paramInt4 += i;
/*  704 */           paramInt1 += j;
/*      */         }
/*  706 */         return;
/*      */       }
/*      */ 
/*  709 */       paramInt2 -= paramInt3;
/*  710 */       paramInt3 -= paramInt1;
/*  711 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  713 */         cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  714 */         paramInt5 += m;
/*  715 */         paramInt4 += i;
/*  716 */         paramInt1 += j; }
/*      */       while (true) {
/*  718 */         paramInt2--; if (paramInt2 < 0) break;
/*  719 */         cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  720 */         paramInt6 += j;
/*  721 */         paramInt4 += i;
/*  722 */         paramInt1 += j;
/*      */       }
/*  724 */       return;
/*      */     }
/*      */ 
/*  728 */     if (paramInt2 <= paramInt3) {
/*  729 */       if (paramInt2 >= p) return;
/*  730 */       if (paramInt3 > p) paramInt3 = p;
/*  731 */       if (paramInt1 > p) paramInt1 = p;
/*  732 */       if (paramInt3 < paramInt1) {
/*  733 */         paramInt4 = paramInt5 <<= 16;
/*  734 */         if (paramInt2 < 0) {
/*  735 */           paramInt4 -= i * paramInt2;
/*  736 */           paramInt5 -= j * paramInt2;
/*  737 */           paramInt2 = 0;
/*      */         }
/*  739 */         paramInt6 <<= 16;
/*  740 */         if (paramInt3 < 0) {
/*  741 */           paramInt6 -= m * paramInt3;
/*  742 */           paramInt3 = 0;
/*      */         }
/*  744 */         if (((paramInt2 != paramInt3) && (i < j)) || ((paramInt2 == paramInt3) && (i > m))) {
/*  745 */           paramInt1 -= paramInt3;
/*  746 */           paramInt3 -= paramInt2;
/*  747 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  749 */             cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  750 */             paramInt4 += i;
/*  751 */             paramInt5 += j;
/*  752 */             paramInt2 += j; }
/*      */           while (true) {
/*  754 */             paramInt1--; if (paramInt1 < 0) break;
/*  755 */             cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  756 */             paramInt4 += i;
/*  757 */             paramInt6 += m;
/*  758 */             paramInt2 += j;
/*      */           }
/*  760 */           return;
/*      */         }
/*      */ 
/*  763 */         paramInt1 -= paramInt3;
/*  764 */         paramInt3 -= paramInt2;
/*  765 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  767 */           cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  768 */           paramInt4 += i;
/*  769 */           paramInt5 += j;
/*  770 */           paramInt2 += j; }
/*      */         while (true) {
/*  772 */           paramInt1--; if (paramInt1 < 0) break;
/*  773 */           cl(n, paramInt2, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  774 */           paramInt4 += i;
/*  775 */           paramInt6 += m;
/*  776 */           paramInt2 += j;
/*      */         }
/*  778 */         return;
/*      */       }
/*      */ 
/*  782 */       paramInt6 = paramInt5 <<= 16;
/*  783 */       if (paramInt2 < 0) {
/*  784 */         paramInt6 -= i * paramInt2;
/*  785 */         paramInt5 -= j * paramInt2;
/*  786 */         paramInt2 = 0;
/*      */       }
/*  788 */       paramInt4 <<= 16;
/*  789 */       if (paramInt1 < 0) {
/*  790 */         paramInt4 -= m * paramInt1;
/*  791 */         paramInt1 = 0;
/*      */       }
/*  793 */       if (i < j) {
/*  794 */         paramInt3 -= paramInt1;
/*  795 */         paramInt1 -= paramInt2;
/*  796 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  798 */           cl(n, paramInt2, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  799 */           paramInt6 += i;
/*  800 */           paramInt5 += j;
/*  801 */           paramInt2 += j; }
/*      */         while (true) {
/*  803 */           paramInt3--; if (paramInt3 < 0) break;
/*  804 */           cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  805 */           paramInt4 += m;
/*  806 */           paramInt5 += j;
/*  807 */           paramInt2 += j;
/*      */         }
/*  809 */         return;
/*      */       }
/*      */ 
/*  812 */       paramInt3 -= paramInt1;
/*  813 */       paramInt1 -= paramInt2;
/*  814 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  816 */         cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  817 */         paramInt6 += i;
/*  818 */         paramInt5 += j;
/*  819 */         paramInt2 += j; }
/*      */       while (true) {
/*  821 */         paramInt3--; if (paramInt3 < 0) break;
/*  822 */         cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  823 */         paramInt4 += m;
/*  824 */         paramInt5 += j;
/*  825 */         paramInt2 += j;
/*      */       }
/*  827 */       return;
/*      */     }
/*      */ 
/*  832 */     if (paramInt3 >= p) return;
/*  833 */     if (paramInt1 > p) paramInt1 = p;
/*  834 */     if (paramInt2 > p) paramInt2 = p;
/*  835 */     if (paramInt1 < paramInt2) {
/*  836 */       paramInt5 = paramInt6 <<= 16;
/*  837 */       if (paramInt3 < 0) {
/*  838 */         paramInt5 -= j * paramInt3;
/*  839 */         paramInt6 -= m * paramInt3;
/*  840 */         paramInt3 = 0;
/*      */       }
/*  842 */       paramInt4 <<= 16;
/*  843 */       if (paramInt1 < 0) {
/*  844 */         paramInt4 -= i * paramInt1;
/*  845 */         paramInt1 = 0;
/*      */       }
/*  847 */       if (j < m) {
/*  848 */         paramInt2 -= paramInt1;
/*  849 */         paramInt1 -= paramInt3;
/*  850 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  852 */           cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  853 */           paramInt5 += j;
/*  854 */           paramInt6 += m;
/*  855 */           paramInt3 += j; }
/*      */         while (true) {
/*  857 */           paramInt2--; if (paramInt2 < 0) break;
/*  858 */           cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  859 */           paramInt5 += j;
/*  860 */           paramInt4 += i;
/*  861 */           paramInt3 += j;
/*      */         }
/*  863 */         return;
/*      */       }
/*      */ 
/*  866 */       paramInt2 -= paramInt1;
/*  867 */       paramInt1 -= paramInt3;
/*  868 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  870 */         cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  871 */         paramInt5 += j;
/*  872 */         paramInt6 += m;
/*  873 */         paramInt3 += j; }
/*      */       while (true) {
/*  875 */         paramInt2--; if (paramInt2 < 0) break;
/*  876 */         cl(n, paramInt3, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  877 */         paramInt5 += j;
/*  878 */         paramInt4 += i;
/*  879 */         paramInt3 += j;
/*      */       }
/*  881 */       return;
/*      */     }
/*      */ 
/*  885 */     paramInt4 = paramInt6 <<= 16;
/*  886 */     if (paramInt3 < 0) {
/*  887 */       paramInt4 -= j * paramInt3;
/*  888 */       paramInt6 -= m * paramInt3;
/*  889 */       paramInt3 = 0;
/*      */     }
/*  891 */     paramInt5 <<= 16;
/*  892 */     if (paramInt2 < 0) {
/*  893 */       paramInt5 -= i * paramInt2;
/*  894 */       paramInt2 = 0;
/*      */     }
/*  896 */     if (j < m) {
/*  897 */       paramInt1 -= paramInt2;
/*  898 */       paramInt2 -= paramInt3;
/*  899 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  901 */         cl(n, paramInt3, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  902 */         paramInt4 += j;
/*  903 */         paramInt6 += m;
/*  904 */         paramInt3 += j; }
/*      */       while (true) {
/*  906 */         paramInt1--; if (paramInt1 < 0) break;
/*  907 */         cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  908 */         paramInt5 += i;
/*  909 */         paramInt6 += m;
/*  910 */         paramInt3 += j;
/*      */       }
/*  912 */       return;
/*      */     }
/*      */ 
/*  915 */     paramInt1 -= paramInt2;
/*  916 */     paramInt2 -= paramInt3;
/*  917 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  919 */       cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  920 */       paramInt4 += j;
/*  921 */       paramInt6 += m;
/*  922 */       paramInt3 += j; }
/*      */     while (true) {
/*  924 */       paramInt1--; if (paramInt1 < 0) break;
/*  925 */       cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  926 */       paramInt5 += i;
/*  927 */       paramInt6 += m;
/*  928 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void cl(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*  937 */     if (u) {
/*  938 */       if (paramInt5 > x) paramInt5 = x;
/*  939 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  941 */     if (paramInt4 >= paramInt5) return;
/*  942 */     paramInt1 += paramInt4;
/*  943 */     paramInt3 = paramInt5 - paramInt4 >> 2;
/*  944 */     if (b == 0) {
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  946 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  947 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  948 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  949 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*      */       }
/*  951 */       paramInt3 = paramInt5 - paramInt4 & 0x3;
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  953 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*      */       }
/*      */     }
/*  956 */     if (b == 254) {
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  958 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*  959 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*  960 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*  961 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*      */       }
/*  963 */       paramInt3 = paramInt5 - paramInt4 & 0x3;
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  965 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1]; }  } 
/*      */ int i = b;
/*  970 */     int j = 256 - b;
/*  971 */     paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */     int m;
/*      */     while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  973 */       m = paramArrayOfInt[paramInt1];
/*  974 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  975 */       m = paramArrayOfInt[paramInt1];
/*  976 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  977 */       m = paramArrayOfInt[paramInt1];
/*  978 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  979 */       m = paramArrayOfInt[paramInt1];
/*  980 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*      */     }
/*  982 */     paramInt3 = paramInt5 - paramInt4 & 0x3;
/*      */     while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  984 */       m = paramArrayOfInt[paramInt1];
/*  985 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void cp(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19)
/*      */   {
/*  991 */     int[] arrayOfInt = av.r(paramInt19, -112476939);
/*  992 */     if (arrayOfInt == null) {
/*  993 */       i = av.d(paramInt19, -2127473748);
/*  994 */       cr(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, cu(i, paramInt7), cu(i, paramInt8), cu(i, paramInt9));
/*  995 */       return;
/*      */     }
/*  997 */     w = av.m(paramInt19, 2131682911);
/*  998 */     v = av.l(paramInt19, 264071661);
/*  999 */     int i = paramInt5 - paramInt4;
/* 1000 */     int j = paramInt2 - paramInt1;
/* 1001 */     int m = paramInt6 - paramInt4;
/* 1002 */     int n = paramInt3 - paramInt1;
/* 1003 */     int i1 = paramInt8 - paramInt7;
/* 1004 */     int i2 = paramInt9 - paramInt7;
/* 1005 */     int i3 = 0;
/* 1006 */     if (paramInt2 != paramInt1) i3 = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/* 1007 */     int i4 = 0;
/* 1008 */     if (paramInt3 != paramInt2) i4 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/* 1009 */     int i5 = 0;
/* 1010 */     if (paramInt3 != paramInt1) i5 = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/* 1011 */     int i6 = i * n - m * j;
/* 1012 */     if (i6 == 0) return;
/* 1013 */     int i7 = (i1 * n - i2 * j << 9) / i6;
/* 1014 */     int i8 = (i2 * i - i1 * m << 9) / i6;
/* 1015 */     paramInt11 = paramInt10 - paramInt11;
/* 1016 */     paramInt14 = paramInt13 - paramInt14;
/* 1017 */     paramInt17 = paramInt16 - paramInt17;
/* 1018 */     paramInt12 -= paramInt10;
/* 1019 */     paramInt15 -= paramInt13;
/* 1020 */     paramInt18 -= paramInt16;
/* 1021 */     int i9 = paramInt12 * paramInt13 - paramInt15 * paramInt10 << 14;
/* 1022 */     int i10 = paramInt15 * paramInt16 - paramInt18 * paramInt13 << 8;
/* 1023 */     int i11 = paramInt18 * paramInt10 - paramInt12 * paramInt16 << 5;
/* 1024 */     int i12 = paramInt11 * paramInt13 - paramInt14 * paramInt10 << 14;
/* 1025 */     int i13 = paramInt14 * paramInt16 - paramInt17 * paramInt13 << 8;
/* 1026 */     int i14 = paramInt17 * paramInt10 - paramInt11 * paramInt16 << 5;
/* 1027 */     int i15 = paramInt14 * paramInt12 - paramInt11 * paramInt15 << 14;
/* 1028 */     int i16 = paramInt17 * paramInt15 - paramInt14 * paramInt18 << 8;
/* 1029 */     int i17 = paramInt11 * paramInt18 - paramInt17 * paramInt12 << 5;
/* 1030 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/* 1031 */       if (paramInt1 >= p) return;
/* 1032 */       if (paramInt2 > p) paramInt2 = p;
/* 1033 */       if (paramInt3 > p) paramInt3 = p;
/* 1034 */       paramInt7 = (paramInt7 << 9) - i7 * paramInt4 + i7;
/* 1035 */       if (paramInt2 < paramInt3) {
/* 1036 */         paramInt6 = paramInt4 <<= 16;
/* 1037 */         if (paramInt1 < 0) {
/* 1038 */           paramInt6 -= i5 * paramInt1;
/* 1039 */           paramInt4 -= i3 * paramInt1;
/* 1040 */           paramInt7 -= i8 * paramInt1;
/* 1041 */           paramInt1 = 0;
/*      */         }
/* 1043 */         paramInt5 <<= 16;
/* 1044 */         if (paramInt2 < 0) {
/* 1045 */           paramInt5 -= i4 * paramInt2;
/* 1046 */           paramInt2 = 0;
/*      */         }
/* 1048 */         i18 = paramInt1 - h;
/* 1049 */         i9 += i11 * i18;
/* 1050 */         i12 += i14 * i18;
/* 1051 */         i15 += i17 * i18;
/* 1052 */         if (((paramInt1 != paramInt2) && (i5 < i3)) || ((paramInt1 == paramInt2) && (i5 > i4))) {
/* 1053 */           paramInt3 -= paramInt2;
/* 1054 */           paramInt2 -= paramInt1;
/* 1055 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1057 */             ca(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1058 */             paramInt6 += i5;
/* 1059 */             paramInt4 += i3;
/* 1060 */             paramInt7 += i8;
/* 1061 */             paramInt1 += j;
/* 1062 */             i9 += i11;
/* 1063 */             i12 += i14;
/* 1064 */             i15 += i17; }
/*      */           while (true) {
/* 1066 */             paramInt3--; if (paramInt3 < 0) break;
/* 1067 */             ca(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1068 */             paramInt6 += i5;
/* 1069 */             paramInt5 += i4;
/* 1070 */             paramInt7 += i8;
/* 1071 */             paramInt1 += j;
/* 1072 */             i9 += i11;
/* 1073 */             i12 += i14;
/* 1074 */             i15 += i17;
/*      */           }
/* 1076 */           return;
/*      */         }
/*      */ 
/* 1079 */         paramInt3 -= paramInt2;
/* 1080 */         paramInt2 -= paramInt1;
/* 1081 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1083 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1084 */           paramInt6 += i5;
/* 1085 */           paramInt4 += i3;
/* 1086 */           paramInt7 += i8;
/* 1087 */           paramInt1 += j;
/* 1088 */           i9 += i11;
/* 1089 */           i12 += i14;
/* 1090 */           i15 += i17; }
/*      */         while (true) {
/* 1092 */           paramInt3--; if (paramInt3 < 0) break;
/* 1093 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1094 */           paramInt6 += i5;
/* 1095 */           paramInt5 += i4;
/* 1096 */           paramInt7 += i8;
/* 1097 */           paramInt1 += j;
/* 1098 */           i9 += i11;
/* 1099 */           i12 += i14;
/* 1100 */           i15 += i17;
/*      */         }
/* 1102 */         return;
/*      */       }
/*      */ 
/* 1106 */       paramInt5 = paramInt4 <<= 16;
/* 1107 */       if (paramInt1 < 0) {
/* 1108 */         paramInt5 -= i5 * paramInt1;
/* 1109 */         paramInt4 -= i3 * paramInt1;
/* 1110 */         paramInt7 -= i8 * paramInt1;
/* 1111 */         paramInt1 = 0;
/*      */       }
/* 1113 */       paramInt6 <<= 16;
/* 1114 */       if (paramInt3 < 0) {
/* 1115 */         paramInt6 -= i4 * paramInt3;
/* 1116 */         paramInt3 = 0;
/*      */       }
/* 1118 */       i18 = paramInt1 - h;
/* 1119 */       i9 += i11 * i18;
/* 1120 */       i12 += i14 * i18;
/* 1121 */       i15 += i17 * i18;
/* 1122 */       if (((paramInt1 != paramInt3) && (i5 < i3)) || ((paramInt1 == paramInt3) && (i4 > i3))) {
/* 1123 */         paramInt2 -= paramInt3;
/* 1124 */         paramInt3 -= paramInt1;
/* 1125 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1127 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1128 */           paramInt5 += i5;
/* 1129 */           paramInt4 += i3;
/* 1130 */           paramInt7 += i8;
/* 1131 */           paramInt1 += j;
/* 1132 */           i9 += i11;
/* 1133 */           i12 += i14;
/* 1134 */           i15 += i17; }
/*      */         while (true) {
/* 1136 */           paramInt2--; if (paramInt2 < 0) break;
/* 1137 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1138 */           paramInt6 += i4;
/* 1139 */           paramInt4 += i3;
/* 1140 */           paramInt7 += i8;
/* 1141 */           paramInt1 += j;
/* 1142 */           i9 += i11;
/* 1143 */           i12 += i14;
/* 1144 */           i15 += i17;
/*      */         }
/* 1146 */         return;
/*      */       }
/*      */ 
/* 1149 */       paramInt2 -= paramInt3;
/* 1150 */       paramInt3 -= paramInt1;
/* 1151 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1153 */         ca(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1154 */         paramInt5 += i5;
/* 1155 */         paramInt4 += i3;
/* 1156 */         paramInt7 += i8;
/* 1157 */         paramInt1 += j;
/* 1158 */         i9 += i11;
/* 1159 */         i12 += i14;
/* 1160 */         i15 += i17; }
/*      */       while (true) {
/* 1162 */         paramInt2--; if (paramInt2 < 0) break;
/* 1163 */         ca(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1164 */         paramInt6 += i4;
/* 1165 */         paramInt4 += i3;
/* 1166 */         paramInt7 += i8;
/* 1167 */         paramInt1 += j;
/* 1168 */         i9 += i11;
/* 1169 */         i12 += i14;
/* 1170 */         i15 += i17;
/*      */       }
/* 1172 */       return;
/*      */     }
/*      */ 
/* 1176 */     if (paramInt2 <= paramInt3) {
/* 1177 */       if (paramInt2 >= p) return;
/* 1178 */       if (paramInt3 > p) paramInt3 = p;
/* 1179 */       if (paramInt1 > p) paramInt1 = p;
/* 1180 */       paramInt8 = (paramInt8 << 9) - i7 * paramInt5 + i7;
/* 1181 */       if (paramInt3 < paramInt1) {
/* 1182 */         paramInt4 = paramInt5 <<= 16;
/* 1183 */         if (paramInt2 < 0) {
/* 1184 */           paramInt4 -= i3 * paramInt2;
/* 1185 */           paramInt5 -= i4 * paramInt2;
/* 1186 */           paramInt8 -= i8 * paramInt2;
/* 1187 */           paramInt2 = 0;
/*      */         }
/* 1189 */         paramInt6 <<= 16;
/* 1190 */         if (paramInt3 < 0) {
/* 1191 */           paramInt6 -= i5 * paramInt3;
/* 1192 */           paramInt3 = 0;
/*      */         }
/* 1194 */         i18 = paramInt2 - h;
/* 1195 */         i9 += i11 * i18;
/* 1196 */         i12 += i14 * i18;
/* 1197 */         i15 += i17 * i18;
/* 1198 */         if (((paramInt2 != paramInt3) && (i3 < i4)) || ((paramInt2 == paramInt3) && (i3 > i5))) {
/* 1199 */           paramInt1 -= paramInt3;
/* 1200 */           paramInt3 -= paramInt2;
/* 1201 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1203 */             ca(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1204 */             paramInt4 += i3;
/* 1205 */             paramInt5 += i4;
/* 1206 */             paramInt8 += i8;
/* 1207 */             paramInt2 += j;
/* 1208 */             i9 += i11;
/* 1209 */             i12 += i14;
/* 1210 */             i15 += i17; }
/*      */           while (true) {
/* 1212 */             paramInt1--; if (paramInt1 < 0) break;
/* 1213 */             ca(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1214 */             paramInt4 += i3;
/* 1215 */             paramInt6 += i5;
/* 1216 */             paramInt8 += i8;
/* 1217 */             paramInt2 += j;
/* 1218 */             i9 += i11;
/* 1219 */             i12 += i14;
/* 1220 */             i15 += i17;
/*      */           }
/* 1222 */           return;
/*      */         }
/*      */ 
/* 1225 */         paramInt1 -= paramInt3;
/* 1226 */         paramInt3 -= paramInt2;
/* 1227 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1229 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1230 */           paramInt4 += i3;
/* 1231 */           paramInt5 += i4;
/* 1232 */           paramInt8 += i8;
/* 1233 */           paramInt2 += j;
/* 1234 */           i9 += i11;
/* 1235 */           i12 += i14;
/* 1236 */           i15 += i17; }
/*      */         while (true) {
/* 1238 */           paramInt1--; if (paramInt1 < 0) break;
/* 1239 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1240 */           paramInt4 += i3;
/* 1241 */           paramInt6 += i5;
/* 1242 */           paramInt8 += i8;
/* 1243 */           paramInt2 += j;
/* 1244 */           i9 += i11;
/* 1245 */           i12 += i14;
/* 1246 */           i15 += i17;
/*      */         }
/* 1248 */         return;
/*      */       }
/*      */ 
/* 1252 */       paramInt6 = paramInt5 <<= 16;
/* 1253 */       if (paramInt2 < 0) {
/* 1254 */         paramInt6 -= i3 * paramInt2;
/* 1255 */         paramInt5 -= i4 * paramInt2;
/* 1256 */         paramInt8 -= i8 * paramInt2;
/* 1257 */         paramInt2 = 0;
/*      */       }
/* 1259 */       paramInt4 <<= 16;
/* 1260 */       if (paramInt1 < 0) {
/* 1261 */         paramInt4 -= i5 * paramInt1;
/* 1262 */         paramInt1 = 0;
/*      */       }
/* 1264 */       i18 = paramInt2 - h;
/* 1265 */       i9 += i11 * i18;
/* 1266 */       i12 += i14 * i18;
/* 1267 */       i15 += i17 * i18;
/* 1268 */       if (i3 < i4) {
/* 1269 */         paramInt3 -= paramInt1;
/* 1270 */         paramInt1 -= paramInt2;
/* 1271 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1273 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1274 */           paramInt6 += i3;
/* 1275 */           paramInt5 += i4;
/* 1276 */           paramInt8 += i8;
/* 1277 */           paramInt2 += j;
/* 1278 */           i9 += i11;
/* 1279 */           i12 += i14;
/* 1280 */           i15 += i17; }
/*      */         while (true) {
/* 1282 */           paramInt3--; if (paramInt3 < 0) break;
/* 1283 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1284 */           paramInt4 += i5;
/* 1285 */           paramInt5 += i4;
/* 1286 */           paramInt8 += i8;
/* 1287 */           paramInt2 += j;
/* 1288 */           i9 += i11;
/* 1289 */           i12 += i14;
/* 1290 */           i15 += i17;
/*      */         }
/* 1292 */         return;
/*      */       }
/*      */ 
/* 1295 */       paramInt3 -= paramInt1;
/* 1296 */       paramInt1 -= paramInt2;
/* 1297 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1299 */         ca(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1300 */         paramInt6 += i3;
/* 1301 */         paramInt5 += i4;
/* 1302 */         paramInt8 += i8;
/* 1303 */         paramInt2 += j;
/* 1304 */         i9 += i11;
/* 1305 */         i12 += i14;
/* 1306 */         i15 += i17; }
/*      */       while (true) {
/* 1308 */         paramInt3--; if (paramInt3 < 0) break;
/* 1309 */         ca(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1310 */         paramInt4 += i5;
/* 1311 */         paramInt5 += i4;
/* 1312 */         paramInt8 += i8;
/* 1313 */         paramInt2 += j;
/* 1314 */         i9 += i11;
/* 1315 */         i12 += i14;
/* 1316 */         i15 += i17;
/*      */       }
/* 1318 */       return;
/*      */     }
/*      */ 
/* 1323 */     if (paramInt3 >= p) return;
/* 1324 */     if (paramInt1 > p) paramInt1 = p;
/* 1325 */     if (paramInt2 > p) paramInt2 = p;
/* 1326 */     paramInt9 = (paramInt9 << 9) - i7 * paramInt6 + i7;
/* 1327 */     if (paramInt1 < paramInt2) {
/* 1328 */       paramInt5 = paramInt6 <<= 16;
/* 1329 */       if (paramInt3 < 0) {
/* 1330 */         paramInt5 -= i4 * paramInt3;
/* 1331 */         paramInt6 -= i5 * paramInt3;
/* 1332 */         paramInt9 -= i8 * paramInt3;
/* 1333 */         paramInt3 = 0;
/*      */       }
/* 1335 */       paramInt4 <<= 16;
/* 1336 */       if (paramInt1 < 0) {
/* 1337 */         paramInt4 -= i3 * paramInt1;
/* 1338 */         paramInt1 = 0;
/*      */       }
/* 1340 */       i18 = paramInt3 - h;
/* 1341 */       i9 += i11 * i18;
/* 1342 */       i12 += i14 * i18;
/* 1343 */       i15 += i17 * i18;
/* 1344 */       if (i4 < i5) {
/* 1345 */         paramInt2 -= paramInt1;
/* 1346 */         paramInt1 -= paramInt3;
/* 1347 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1349 */           ca(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1350 */           paramInt5 += i4;
/* 1351 */           paramInt6 += i5;
/* 1352 */           paramInt9 += i8;
/* 1353 */           paramInt3 += j;
/* 1354 */           i9 += i11;
/* 1355 */           i12 += i14;
/* 1356 */           i15 += i17; }
/*      */         while (true) {
/* 1358 */           paramInt2--; if (paramInt2 < 0) break;
/* 1359 */           ca(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1360 */           paramInt5 += i4;
/* 1361 */           paramInt4 += i3;
/* 1362 */           paramInt9 += i8;
/* 1363 */           paramInt3 += j;
/* 1364 */           i9 += i11;
/* 1365 */           i12 += i14;
/* 1366 */           i15 += i17;
/*      */         }
/* 1368 */         return;
/*      */       }
/*      */ 
/* 1371 */       paramInt2 -= paramInt1;
/* 1372 */       paramInt1 -= paramInt3;
/* 1373 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1375 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1376 */         paramInt5 += i4;
/* 1377 */         paramInt6 += i5;
/* 1378 */         paramInt9 += i8;
/* 1379 */         paramInt3 += j;
/* 1380 */         i9 += i11;
/* 1381 */         i12 += i14;
/* 1382 */         i15 += i17; }
/*      */       while (true) {
/* 1384 */         paramInt2--; if (paramInt2 < 0) break;
/* 1385 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1386 */         paramInt5 += i4;
/* 1387 */         paramInt4 += i3;
/* 1388 */         paramInt9 += i8;
/* 1389 */         paramInt3 += j;
/* 1390 */         i9 += i11;
/* 1391 */         i12 += i14;
/* 1392 */         i15 += i17;
/*      */       }
/* 1394 */       return;
/*      */     }
/*      */ 
/* 1398 */     paramInt4 = paramInt6 <<= 16;
/* 1399 */     if (paramInt3 < 0) {
/* 1400 */       paramInt4 -= i4 * paramInt3;
/* 1401 */       paramInt6 -= i5 * paramInt3;
/* 1402 */       paramInt9 -= i8 * paramInt3;
/* 1403 */       paramInt3 = 0;
/*      */     }
/* 1405 */     paramInt5 <<= 16;
/* 1406 */     if (paramInt2 < 0) {
/* 1407 */       paramInt5 -= i3 * paramInt2;
/* 1408 */       paramInt2 = 0;
/*      */     }
/* 1410 */     int i18 = paramInt3 - h;
/* 1411 */     i9 += i11 * i18;
/* 1412 */     i12 += i14 * i18;
/* 1413 */     i15 += i17 * i18;
/* 1414 */     if (i4 < i5) {
/* 1415 */       paramInt1 -= paramInt2;
/* 1416 */       paramInt2 -= paramInt3;
/* 1417 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1419 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1420 */         paramInt4 += i4;
/* 1421 */         paramInt6 += i5;
/* 1422 */         paramInt9 += i8;
/* 1423 */         paramInt3 += j;
/* 1424 */         i9 += i11;
/* 1425 */         i12 += i14;
/* 1426 */         i15 += i17; }
/*      */       while (true) {
/* 1428 */         paramInt1--; if (paramInt1 < 0) break;
/* 1429 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1430 */         paramInt5 += i3;
/* 1431 */         paramInt6 += i5;
/* 1432 */         paramInt9 += i8;
/* 1433 */         paramInt3 += j;
/* 1434 */         i9 += i11;
/* 1435 */         i12 += i14;
/* 1436 */         i15 += i17;
/*      */       }
/* 1438 */       return;
/*      */     }
/*      */ 
/* 1441 */     paramInt1 -= paramInt2;
/* 1442 */     paramInt2 -= paramInt3;
/* 1443 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1445 */       ca(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1446 */       paramInt4 += i4;
/* 1447 */       paramInt6 += i5;
/* 1448 */       paramInt9 += i8;
/* 1449 */       paramInt3 += j;
/* 1450 */       i9 += i11;
/* 1451 */       i12 += i14;
/* 1452 */       i15 += i17; }
/*      */     while (true) {
/* 1454 */       paramInt1--; if (paramInt1 < 0) break;
/* 1455 */       ca(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1456 */       paramInt5 += i3;
/* 1457 */       paramInt6 += i5;
/* 1458 */       paramInt9 += i8;
/* 1459 */       paramInt3 += j;
/* 1460 */       i9 += i11;
/* 1461 */       i12 += i14;
/* 1462 */       i15 += i17;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dm(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*  937 */     if (u) {
/*  938 */       if (paramInt5 > x) paramInt5 = x;
/*  939 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  941 */     if (paramInt4 >= paramInt5) return;
/*  942 */     paramInt1 += paramInt4;
/*  943 */     paramInt3 = paramInt5 - paramInt4 >> 2;
/*  944 */     if (b == 0) {
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  946 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  947 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  948 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  949 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*      */       }
/*  951 */       paramInt3 = paramInt5 - paramInt4 & 0x3;
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  953 */         paramArrayOfInt[(paramInt1++)] = paramInt2;
/*      */       }
/*      */     }
/*  956 */     if (b == 254) {
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  958 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*  959 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*  960 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*  961 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1];
/*      */       }
/*  963 */       paramInt3 = paramInt5 - paramInt4 & 0x3;
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  965 */         paramArrayOfInt[(paramInt1++)] = paramArrayOfInt[paramInt1]; }  } 
/*      */ int i = b;
/*  970 */     int j = 256 - b;
/*  971 */     paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */     int m;
/*      */     while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  973 */       m = paramArrayOfInt[paramInt1];
/*  974 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  975 */       m = paramArrayOfInt[paramInt1];
/*  976 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  977 */       m = paramArrayOfInt[paramInt1];
/*  978 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  979 */       m = paramArrayOfInt[paramInt1];
/*  980 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*      */     }
/*  982 */     paramInt3 = paramInt5 - paramInt4 & 0x3;
/*      */     while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  984 */       m = paramArrayOfInt[paramInt1];
/*  985 */       paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void co(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19)
/*      */   {
/* 1834 */     int[] arrayOfInt = av.r(paramInt19, -112476939);
/* 1835 */     if (arrayOfInt == null) {
/* 1836 */       i = av.d(paramInt19, -2136958796);
/* 1837 */       cr(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, cu(i, paramInt7), cu(i, paramInt8), cu(i, paramInt9));
/* 1838 */       return;
/*      */     }
/* 1840 */     w = av.m(paramInt19, 1541127083);
/* 1841 */     v = av.l(paramInt19, -1689975063);
/* 1842 */     int i = paramInt5 - paramInt4;
/* 1843 */     int j = paramInt2 - paramInt1;
/* 1844 */     int m = paramInt6 - paramInt4;
/* 1845 */     int n = paramInt3 - paramInt1;
/* 1846 */     int i1 = paramInt8 - paramInt7;
/* 1847 */     int i2 = paramInt9 - paramInt7;
/* 1848 */     int i3 = 0;
/* 1849 */     if (paramInt2 != paramInt1) i3 = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/* 1850 */     int i4 = 0;
/* 1851 */     if (paramInt3 != paramInt2) i4 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/* 1852 */     int i5 = 0;
/* 1853 */     if (paramInt3 != paramInt1) i5 = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/* 1854 */     int i6 = i * n - m * j;
/* 1855 */     if (i6 == 0) return;
/* 1856 */     int i7 = (i1 * n - i2 * j << 9) / i6;
/* 1857 */     int i8 = (i2 * i - i1 * m << 9) / i6;
/* 1858 */     paramInt11 = paramInt10 - paramInt11;
/* 1859 */     paramInt14 = paramInt13 - paramInt14;
/* 1860 */     paramInt17 = paramInt16 - paramInt17;
/* 1861 */     paramInt12 -= paramInt10;
/* 1862 */     paramInt15 -= paramInt13;
/* 1863 */     paramInt18 -= paramInt16;
/* 1864 */     int i9 = paramInt12 * paramInt13 - paramInt15 * paramInt10 << 14;
/* 1865 */     int i10 = paramInt15 * paramInt16 - paramInt18 * paramInt13 << 5;
/* 1866 */     int i11 = paramInt18 * paramInt10 - paramInt12 * paramInt16 << 5;
/* 1867 */     int i12 = paramInt11 * paramInt13 - paramInt14 * paramInt10 << 14;
/* 1868 */     int i13 = paramInt14 * paramInt16 - paramInt17 * paramInt13 << 5;
/* 1869 */     int i14 = paramInt17 * paramInt10 - paramInt11 * paramInt16 << 5;
/* 1870 */     int i15 = paramInt14 * paramInt12 - paramInt11 * paramInt15 << 14;
/* 1871 */     int i16 = paramInt17 * paramInt15 - paramInt14 * paramInt18 << 5;
/* 1872 */     int i17 = paramInt11 * paramInt18 - paramInt17 * paramInt12 << 5;
/* 1873 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/* 1874 */       if (paramInt1 >= p) return;
/* 1875 */       if (paramInt2 > p) paramInt2 = p;
/* 1876 */       if (paramInt3 > p) paramInt3 = p;
/* 1877 */       paramInt7 = (paramInt7 << 9) - i7 * paramInt4 + i7;
/* 1878 */       if (paramInt2 < paramInt3) {
/* 1879 */         paramInt6 = paramInt4 <<= 16;
/* 1880 */         if (paramInt1 < 0) {
/* 1881 */           paramInt6 -= i5 * paramInt1;
/* 1882 */           paramInt4 -= i3 * paramInt1;
/* 1883 */           paramInt7 -= i8 * paramInt1;
/* 1884 */           paramInt1 = 0;
/*      */         }
/* 1886 */         paramInt5 <<= 16;
/* 1887 */         if (paramInt2 < 0) {
/* 1888 */           paramInt5 -= i4 * paramInt2;
/* 1889 */           paramInt2 = 0;
/*      */         }
/* 1891 */         i18 = paramInt1 - h;
/* 1892 */         i9 += i11 * i18;
/* 1893 */         i12 += i14 * i18;
/* 1894 */         i15 += i17 * i18;
/* 1895 */         if (((paramInt1 != paramInt2) && (i5 < i3)) || ((paramInt1 == paramInt2) && (i5 > i4))) {
/* 1896 */           paramInt3 -= paramInt2;
/* 1897 */           paramInt2 -= paramInt1;
/* 1898 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1900 */             ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1901 */             paramInt6 += i5;
/* 1902 */             paramInt4 += i3;
/* 1903 */             paramInt7 += i8;
/* 1904 */             paramInt1 += j;
/* 1905 */             i9 += i11;
/* 1906 */             i12 += i14;
/* 1907 */             i15 += i17; }
/*      */           while (true) {
/* 1909 */             paramInt3--; if (paramInt3 < 0) break;
/* 1910 */             ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1911 */             paramInt6 += i5;
/* 1912 */             paramInt5 += i4;
/* 1913 */             paramInt7 += i8;
/* 1914 */             paramInt1 += j;
/* 1915 */             i9 += i11;
/* 1916 */             i12 += i14;
/* 1917 */             i15 += i17;
/*      */           }
/* 1919 */           return;
/*      */         }
/*      */ 
/* 1922 */         paramInt3 -= paramInt2;
/* 1923 */         paramInt2 -= paramInt1;
/* 1924 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1926 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1927 */           paramInt6 += i5;
/* 1928 */           paramInt4 += i3;
/* 1929 */           paramInt7 += i8;
/* 1930 */           paramInt1 += j;
/* 1931 */           i9 += i11;
/* 1932 */           i12 += i14;
/* 1933 */           i15 += i17; }
/*      */         while (true) {
/* 1935 */           paramInt3--; if (paramInt3 < 0) break;
/* 1936 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1937 */           paramInt6 += i5;
/* 1938 */           paramInt5 += i4;
/* 1939 */           paramInt7 += i8;
/* 1940 */           paramInt1 += j;
/* 1941 */           i9 += i11;
/* 1942 */           i12 += i14;
/* 1943 */           i15 += i17;
/*      */         }
/* 1945 */         return;
/*      */       }
/*      */ 
/* 1949 */       paramInt5 = paramInt4 <<= 16;
/* 1950 */       if (paramInt1 < 0) {
/* 1951 */         paramInt5 -= i5 * paramInt1;
/* 1952 */         paramInt4 -= i3 * paramInt1;
/* 1953 */         paramInt7 -= i8 * paramInt1;
/* 1954 */         paramInt1 = 0;
/*      */       }
/* 1956 */       paramInt6 <<= 16;
/* 1957 */       if (paramInt3 < 0) {
/* 1958 */         paramInt6 -= i4 * paramInt3;
/* 1959 */         paramInt3 = 0;
/*      */       }
/* 1961 */       i18 = paramInt1 - h;
/* 1962 */       i9 += i11 * i18;
/* 1963 */       i12 += i14 * i18;
/* 1964 */       i15 += i17 * i18;
/* 1965 */       if (((paramInt1 != paramInt3) && (i5 < i3)) || ((paramInt1 == paramInt3) && (i4 > i3))) {
/* 1966 */         paramInt2 -= paramInt3;
/* 1967 */         paramInt3 -= paramInt1;
/* 1968 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1970 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1971 */           paramInt5 += i5;
/* 1972 */           paramInt4 += i3;
/* 1973 */           paramInt7 += i8;
/* 1974 */           paramInt1 += j;
/* 1975 */           i9 += i11;
/* 1976 */           i12 += i14;
/* 1977 */           i15 += i17; }
/*      */         while (true) {
/* 1979 */           paramInt2--; if (paramInt2 < 0) break;
/* 1980 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1981 */           paramInt6 += i4;
/* 1982 */           paramInt4 += i3;
/* 1983 */           paramInt7 += i8;
/* 1984 */           paramInt1 += j;
/* 1985 */           i9 += i11;
/* 1986 */           i12 += i14;
/* 1987 */           i15 += i17;
/*      */         }
/* 1989 */         return;
/*      */       }
/*      */ 
/* 1992 */       paramInt2 -= paramInt3;
/* 1993 */       paramInt3 -= paramInt1;
/* 1994 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1996 */         ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1997 */         paramInt5 += i5;
/* 1998 */         paramInt4 += i3;
/* 1999 */         paramInt7 += i8;
/* 2000 */         paramInt1 += j;
/* 2001 */         i9 += i11;
/* 2002 */         i12 += i14;
/* 2003 */         i15 += i17; }
/*      */       while (true) {
/* 2005 */         paramInt2--; if (paramInt2 < 0) break;
/* 2006 */         ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 2007 */         paramInt6 += i4;
/* 2008 */         paramInt4 += i3;
/* 2009 */         paramInt7 += i8;
/* 2010 */         paramInt1 += j;
/* 2011 */         i9 += i11;
/* 2012 */         i12 += i14;
/* 2013 */         i15 += i17;
/*      */       }
/* 2015 */       return;
/*      */     }
/*      */ 
/* 2019 */     if (paramInt2 <= paramInt3) {
/* 2020 */       if (paramInt2 >= p) return;
/* 2021 */       if (paramInt3 > p) paramInt3 = p;
/* 2022 */       if (paramInt1 > p) paramInt1 = p;
/* 2023 */       paramInt8 = (paramInt8 << 9) - i7 * paramInt5 + i7;
/* 2024 */       if (paramInt3 < paramInt1) {
/* 2025 */         paramInt4 = paramInt5 <<= 16;
/* 2026 */         if (paramInt2 < 0) {
/* 2027 */           paramInt4 -= i3 * paramInt2;
/* 2028 */           paramInt5 -= i4 * paramInt2;
/* 2029 */           paramInt8 -= i8 * paramInt2;
/* 2030 */           paramInt2 = 0;
/*      */         }
/* 2032 */         paramInt6 <<= 16;
/* 2033 */         if (paramInt3 < 0) {
/* 2034 */           paramInt6 -= i5 * paramInt3;
/* 2035 */           paramInt3 = 0;
/*      */         }
/* 2037 */         i18 = paramInt2 - h;
/* 2038 */         i9 += i11 * i18;
/* 2039 */         i12 += i14 * i18;
/* 2040 */         i15 += i17 * i18;
/* 2041 */         if (((paramInt2 != paramInt3) && (i3 < i4)) || ((paramInt2 == paramInt3) && (i3 > i5))) {
/* 2042 */           paramInt1 -= paramInt3;
/* 2043 */           paramInt3 -= paramInt2;
/* 2044 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 2046 */             ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2047 */             paramInt4 += i3;
/* 2048 */             paramInt5 += i4;
/* 2049 */             paramInt8 += i8;
/* 2050 */             paramInt2 += j;
/* 2051 */             i9 += i11;
/* 2052 */             i12 += i14;
/* 2053 */             i15 += i17; }
/*      */           while (true) {
/* 2055 */             paramInt1--; if (paramInt1 < 0) break;
/* 2056 */             ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2057 */             paramInt4 += i3;
/* 2058 */             paramInt6 += i5;
/* 2059 */             paramInt8 += i8;
/* 2060 */             paramInt2 += j;
/* 2061 */             i9 += i11;
/* 2062 */             i12 += i14;
/* 2063 */             i15 += i17;
/*      */           }
/* 2065 */           return;
/*      */         }
/*      */ 
/* 2068 */         paramInt1 -= paramInt3;
/* 2069 */         paramInt3 -= paramInt2;
/* 2070 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 2072 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2073 */           paramInt4 += i3;
/* 2074 */           paramInt5 += i4;
/* 2075 */           paramInt8 += i8;
/* 2076 */           paramInt2 += j;
/* 2077 */           i9 += i11;
/* 2078 */           i12 += i14;
/* 2079 */           i15 += i17; }
/*      */         while (true) {
/* 2081 */           paramInt1--; if (paramInt1 < 0) break;
/* 2082 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2083 */           paramInt4 += i3;
/* 2084 */           paramInt6 += i5;
/* 2085 */           paramInt8 += i8;
/* 2086 */           paramInt2 += j;
/* 2087 */           i9 += i11;
/* 2088 */           i12 += i14;
/* 2089 */           i15 += i17;
/*      */         }
/* 2091 */         return;
/*      */       }
/*      */ 
/* 2095 */       paramInt6 = paramInt5 <<= 16;
/* 2096 */       if (paramInt2 < 0) {
/* 2097 */         paramInt6 -= i3 * paramInt2;
/* 2098 */         paramInt5 -= i4 * paramInt2;
/* 2099 */         paramInt8 -= i8 * paramInt2;
/* 2100 */         paramInt2 = 0;
/*      */       }
/* 2102 */       paramInt4 <<= 16;
/* 2103 */       if (paramInt1 < 0) {
/* 2104 */         paramInt4 -= i5 * paramInt1;
/* 2105 */         paramInt1 = 0;
/*      */       }
/* 2107 */       i18 = paramInt2 - h;
/* 2108 */       i9 += i11 * i18;
/* 2109 */       i12 += i14 * i18;
/* 2110 */       i15 += i17 * i18;
/* 2111 */       if (i3 < i4) {
/* 2112 */         paramInt3 -= paramInt1;
/* 2113 */         paramInt1 -= paramInt2;
/* 2114 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2116 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2117 */           paramInt6 += i3;
/* 2118 */           paramInt5 += i4;
/* 2119 */           paramInt8 += i8;
/* 2120 */           paramInt2 += j;
/* 2121 */           i9 += i11;
/* 2122 */           i12 += i14;
/* 2123 */           i15 += i17; }
/*      */         while (true) {
/* 2125 */           paramInt3--; if (paramInt3 < 0) break;
/* 2126 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2127 */           paramInt4 += i5;
/* 2128 */           paramInt5 += i4;
/* 2129 */           paramInt8 += i8;
/* 2130 */           paramInt2 += j;
/* 2131 */           i9 += i11;
/* 2132 */           i12 += i14;
/* 2133 */           i15 += i17;
/*      */         }
/* 2135 */         return;
/*      */       }
/*      */ 
/* 2138 */       paramInt3 -= paramInt1;
/* 2139 */       paramInt1 -= paramInt2;
/* 2140 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2142 */         ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2143 */         paramInt6 += i3;
/* 2144 */         paramInt5 += i4;
/* 2145 */         paramInt8 += i8;
/* 2146 */         paramInt2 += j;
/* 2147 */         i9 += i11;
/* 2148 */         i12 += i14;
/* 2149 */         i15 += i17; }
/*      */       while (true) {
/* 2151 */         paramInt3--; if (paramInt3 < 0) break;
/* 2152 */         ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2153 */         paramInt4 += i5;
/* 2154 */         paramInt5 += i4;
/* 2155 */         paramInt8 += i8;
/* 2156 */         paramInt2 += j;
/* 2157 */         i9 += i11;
/* 2158 */         i12 += i14;
/* 2159 */         i15 += i17;
/*      */       }
/* 2161 */       return;
/*      */     }
/*      */ 
/* 2166 */     if (paramInt3 >= p) return;
/* 2167 */     if (paramInt1 > p) paramInt1 = p;
/* 2168 */     if (paramInt2 > p) paramInt2 = p;
/* 2169 */     paramInt9 = (paramInt9 << 9) - i7 * paramInt6 + i7;
/* 2170 */     if (paramInt1 < paramInt2) {
/* 2171 */       paramInt5 = paramInt6 <<= 16;
/* 2172 */       if (paramInt3 < 0) {
/* 2173 */         paramInt5 -= i4 * paramInt3;
/* 2174 */         paramInt6 -= i5 * paramInt3;
/* 2175 */         paramInt9 -= i8 * paramInt3;
/* 2176 */         paramInt3 = 0;
/*      */       }
/* 2178 */       paramInt4 <<= 16;
/* 2179 */       if (paramInt1 < 0) {
/* 2180 */         paramInt4 -= i3 * paramInt1;
/* 2181 */         paramInt1 = 0;
/*      */       }
/* 2183 */       i18 = paramInt3 - h;
/* 2184 */       i9 += i11 * i18;
/* 2185 */       i12 += i14 * i18;
/* 2186 */       i15 += i17 * i18;
/* 2187 */       if (i4 < i5) {
/* 2188 */         paramInt2 -= paramInt1;
/* 2189 */         paramInt1 -= paramInt3;
/* 2190 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2192 */           ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2193 */           paramInt5 += i4;
/* 2194 */           paramInt6 += i5;
/* 2195 */           paramInt9 += i8;
/* 2196 */           paramInt3 += j;
/* 2197 */           i9 += i11;
/* 2198 */           i12 += i14;
/* 2199 */           i15 += i17; }
/*      */         while (true) {
/* 2201 */           paramInt2--; if (paramInt2 < 0) break;
/* 2202 */           ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2203 */           paramInt5 += i4;
/* 2204 */           paramInt4 += i3;
/* 2205 */           paramInt9 += i8;
/* 2206 */           paramInt3 += j;
/* 2207 */           i9 += i11;
/* 2208 */           i12 += i14;
/* 2209 */           i15 += i17;
/*      */         }
/* 2211 */         return;
/*      */       }
/*      */ 
/* 2214 */       paramInt2 -= paramInt1;
/* 2215 */       paramInt1 -= paramInt3;
/* 2216 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2218 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2219 */         paramInt5 += i4;
/* 2220 */         paramInt6 += i5;
/* 2221 */         paramInt9 += i8;
/* 2222 */         paramInt3 += j;
/* 2223 */         i9 += i11;
/* 2224 */         i12 += i14;
/* 2225 */         i15 += i17; }
/*      */       while (true) {
/* 2227 */         paramInt2--; if (paramInt2 < 0) break;
/* 2228 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2229 */         paramInt5 += i4;
/* 2230 */         paramInt4 += i3;
/* 2231 */         paramInt9 += i8;
/* 2232 */         paramInt3 += j;
/* 2233 */         i9 += i11;
/* 2234 */         i12 += i14;
/* 2235 */         i15 += i17;
/*      */       }
/* 2237 */       return;
/*      */     }
/*      */ 
/* 2241 */     paramInt4 = paramInt6 <<= 16;
/* 2242 */     if (paramInt3 < 0) {
/* 2243 */       paramInt4 -= i4 * paramInt3;
/* 2244 */       paramInt6 -= i5 * paramInt3;
/* 2245 */       paramInt9 -= i8 * paramInt3;
/* 2246 */       paramInt3 = 0;
/*      */     }
/* 2248 */     paramInt5 <<= 16;
/* 2249 */     if (paramInt2 < 0) {
/* 2250 */       paramInt5 -= i3 * paramInt2;
/* 2251 */       paramInt2 = 0;
/*      */     }
/* 2253 */     int i18 = paramInt3 - h;
/* 2254 */     i9 += i11 * i18;
/* 2255 */     i12 += i14 * i18;
/* 2256 */     i15 += i17 * i18;
/* 2257 */     if (i4 < i5) {
/* 2258 */       paramInt1 -= paramInt2;
/* 2259 */       paramInt2 -= paramInt3;
/* 2260 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 2262 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2263 */         paramInt4 += i4;
/* 2264 */         paramInt6 += i5;
/* 2265 */         paramInt9 += i8;
/* 2266 */         paramInt3 += j;
/* 2267 */         i9 += i11;
/* 2268 */         i12 += i14;
/* 2269 */         i15 += i17; }
/*      */       while (true) {
/* 2271 */         paramInt1--; if (paramInt1 < 0) break;
/* 2272 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2273 */         paramInt5 += i3;
/* 2274 */         paramInt6 += i5;
/* 2275 */         paramInt9 += i8;
/* 2276 */         paramInt3 += j;
/* 2277 */         i9 += i11;
/* 2278 */         i12 += i14;
/* 2279 */         i15 += i17;
/*      */       }
/* 2281 */       return;
/*      */     }
/*      */ 
/* 2284 */     paramInt1 -= paramInt2;
/* 2285 */     paramInt2 -= paramInt3;
/* 2286 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 2288 */       ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2289 */       paramInt4 += i4;
/* 2290 */       paramInt6 += i5;
/* 2291 */       paramInt9 += i8;
/* 2292 */       paramInt3 += j;
/* 2293 */       i9 += i11;
/* 2294 */       i12 += i14;
/* 2295 */       i15 += i17; }
/*      */     while (true) {
/* 2297 */       paramInt1--; if (paramInt1 < 0) break;
/* 2298 */       ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2299 */       paramInt5 += i3;
/* 2300 */       paramInt6 += i5;
/* 2301 */       paramInt9 += i8;
/* 2302 */       paramInt3 += j;
/* 2303 */       i9 += i11;
/* 2304 */       i12 += i14;
/* 2305 */       i15 += i17;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dk(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*  172 */     int i = paramInt5 - paramInt4;
/*  173 */     int j = paramInt2 - paramInt1;
/*  174 */     int m = paramInt6 - paramInt4;
/*  175 */     int n = paramInt3 - paramInt1;
/*  176 */     int i1 = paramInt8 - paramInt7;
/*  177 */     int i2 = paramInt9 - paramInt7;
/*      */     int i3;
/*  179 */     if (paramInt3 != paramInt2) i3 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2); else
/*  180 */       i3 = 0;
/*  182 */     int i4;
/*  182 */     if (paramInt2 != paramInt1) i4 = (i << 16) / j; else
/*  183 */       i4 = 0;
/*  185 */     int i5;
/*  185 */     if (paramInt3 != paramInt1) i5 = (m << 16) / n; else
/*  186 */       i5 = 0;
/*  187 */     int i6 = i * n - m * j;
/*  188 */     if (i6 == 0) return;
/*  189 */     int i7 = (i1 * n - i2 * j << 8) / i6;
/*  190 */     int i8 = (i2 * i - i1 * m << 8) / i6;
/*  191 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  192 */       if (paramInt1 >= p) return;
/*  193 */       if (paramInt2 > p) paramInt2 = p;
/*  194 */       if (paramInt3 > p) paramInt3 = p;
/*  195 */       paramInt7 = (paramInt7 << 8) - i7 * paramInt4 + i7;
/*  196 */       if (paramInt2 < paramInt3) {
/*  197 */         paramInt6 = paramInt4 <<= 16;
/*  198 */         if (paramInt1 < 0) {
/*  199 */           paramInt6 -= i5 * paramInt1;
/*  200 */           paramInt4 -= i4 * paramInt1;
/*  201 */           paramInt7 -= i8 * paramInt1;
/*  202 */           paramInt1 = 0;
/*      */         }
/*  204 */         paramInt5 <<= 16;
/*  205 */         if (paramInt2 < 0) {
/*  206 */           paramInt5 -= i3 * paramInt2;
/*  207 */           paramInt2 = 0;
/*      */         }
/*  209 */         if (((paramInt1 != paramInt2) && (i5 < i4)) || ((paramInt1 == paramInt2) && (i5 > i3))) {
/*  210 */           paramInt3 -= paramInt2;
/*  211 */           paramInt2 -= paramInt1;
/*  212 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  214 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  215 */             paramInt6 += i5;
/*  216 */             paramInt4 += i4;
/*  217 */             paramInt7 += i8;
/*  218 */             paramInt1 += j; }
/*      */           while (true) {
/*  220 */             paramInt3--; if (paramInt3 < 0) break;
/*  221 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  222 */             paramInt6 += i5;
/*  223 */             paramInt5 += i3;
/*  224 */             paramInt7 += i8;
/*  225 */             paramInt1 += j;
/*      */           }
/*  227 */           return;
/*      */         }
/*      */ 
/*  230 */         paramInt3 -= paramInt2;
/*  231 */         paramInt2 -= paramInt1;
/*  232 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  234 */           cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  235 */           paramInt6 += i5;
/*  236 */           paramInt4 += i4;
/*  237 */           paramInt7 += i8;
/*  238 */           paramInt1 += j; }
/*      */         while (true) {
/*  240 */           paramInt3--; if (paramInt3 < 0) break;
/*  241 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  242 */           paramInt6 += i5;
/*  243 */           paramInt5 += i3;
/*  244 */           paramInt7 += i8;
/*  245 */           paramInt1 += j;
/*      */         }
/*  247 */         return;
/*      */       }
/*      */ 
/*  251 */       paramInt5 = paramInt4 <<= 16;
/*  252 */       if (paramInt1 < 0) {
/*  253 */         paramInt5 -= i5 * paramInt1;
/*  254 */         paramInt4 -= i4 * paramInt1;
/*  255 */         paramInt7 -= i8 * paramInt1;
/*  256 */         paramInt1 = 0;
/*      */       }
/*  258 */       paramInt6 <<= 16;
/*  259 */       if (paramInt3 < 0) {
/*  260 */         paramInt6 -= i3 * paramInt3;
/*  261 */         paramInt3 = 0;
/*      */       }
/*  263 */       if (((paramInt1 != paramInt3) && (i5 < i4)) || ((paramInt1 == paramInt3) && (i3 > i4))) {
/*  264 */         paramInt2 -= paramInt3;
/*  265 */         paramInt3 -= paramInt1;
/*  266 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  268 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  269 */           paramInt5 += i5;
/*  270 */           paramInt4 += i4;
/*  271 */           paramInt7 += i8;
/*  272 */           paramInt1 += j; }
/*      */         while (true) {
/*  274 */           paramInt2--; if (paramInt2 < 0) break;
/*  275 */           cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  276 */           paramInt6 += i3;
/*  277 */           paramInt4 += i4;
/*  278 */           paramInt7 += i8;
/*  279 */           paramInt1 += j;
/*      */         }
/*  281 */         return;
/*      */       }
/*      */ 
/*  284 */       paramInt2 -= paramInt3;
/*  285 */       paramInt3 -= paramInt1;
/*  286 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  288 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  289 */         paramInt5 += i5;
/*  290 */         paramInt4 += i4;
/*  291 */         paramInt7 += i8;
/*  292 */         paramInt1 += j; }
/*      */       while (true) {
/*  294 */         paramInt2--; if (paramInt2 < 0) break;
/*  295 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  296 */         paramInt6 += i3;
/*  297 */         paramInt4 += i4;
/*  298 */         paramInt7 += i8;
/*  299 */         paramInt1 += j;
/*      */       }
/*  301 */       return;
/*      */     }
/*      */ 
/*  305 */     if (paramInt2 <= paramInt3) {
/*  306 */       if (paramInt2 >= p) return;
/*  307 */       if (paramInt3 > p) paramInt3 = p;
/*  308 */       if (paramInt1 > p) paramInt1 = p;
/*  309 */       paramInt8 = (paramInt8 << 8) - i7 * paramInt5 + i7;
/*  310 */       if (paramInt3 < paramInt1) {
/*  311 */         paramInt4 = paramInt5 <<= 16;
/*  312 */         if (paramInt2 < 0) {
/*  313 */           paramInt4 -= i4 * paramInt2;
/*  314 */           paramInt5 -= i3 * paramInt2;
/*  315 */           paramInt8 -= i8 * paramInt2;
/*  316 */           paramInt2 = 0;
/*      */         }
/*  318 */         paramInt6 <<= 16;
/*  319 */         if (paramInt3 < 0) {
/*  320 */           paramInt6 -= i5 * paramInt3;
/*  321 */           paramInt3 = 0;
/*      */         }
/*  323 */         if (((paramInt2 != paramInt3) && (i4 < i3)) || ((paramInt2 == paramInt3) && (i4 > i5))) {
/*  324 */           paramInt1 -= paramInt3;
/*  325 */           paramInt3 -= paramInt2;
/*  326 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  328 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  329 */             paramInt4 += i4;
/*  330 */             paramInt5 += i3;
/*  331 */             paramInt8 += i8;
/*  332 */             paramInt2 += j; }
/*      */           while (true) {
/*  334 */             paramInt1--; if (paramInt1 < 0) break;
/*  335 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  336 */             paramInt4 += i4;
/*  337 */             paramInt6 += i5;
/*  338 */             paramInt8 += i8;
/*  339 */             paramInt2 += j;
/*      */           }
/*  341 */           return;
/*      */         }
/*      */ 
/*  344 */         paramInt1 -= paramInt3;
/*  345 */         paramInt3 -= paramInt2;
/*  346 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  348 */           cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  349 */           paramInt4 += i4;
/*  350 */           paramInt5 += i3;
/*  351 */           paramInt8 += i8;
/*  352 */           paramInt2 += j; }
/*      */         while (true) {
/*  354 */           paramInt1--; if (paramInt1 < 0) break;
/*  355 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  356 */           paramInt4 += i4;
/*  357 */           paramInt6 += i5;
/*  358 */           paramInt8 += i8;
/*  359 */           paramInt2 += j;
/*      */         }
/*  361 */         return;
/*      */       }
/*      */ 
/*  365 */       paramInt6 = paramInt5 <<= 16;
/*  366 */       if (paramInt2 < 0) {
/*  367 */         paramInt6 -= i4 * paramInt2;
/*  368 */         paramInt5 -= i3 * paramInt2;
/*  369 */         paramInt8 -= i8 * paramInt2;
/*  370 */         paramInt2 = 0;
/*      */       }
/*  372 */       paramInt4 <<= 16;
/*  373 */       if (paramInt1 < 0) {
/*  374 */         paramInt4 -= i5 * paramInt1;
/*  375 */         paramInt1 = 0;
/*      */       }
/*  377 */       if (i4 < i3) {
/*  378 */         paramInt3 -= paramInt1;
/*  379 */         paramInt1 -= paramInt2;
/*  380 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  382 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  383 */           paramInt6 += i4;
/*  384 */           paramInt5 += i3;
/*  385 */           paramInt8 += i8;
/*  386 */           paramInt2 += j; }
/*      */         while (true) {
/*  388 */           paramInt3--; if (paramInt3 < 0) break;
/*  389 */           cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  390 */           paramInt4 += i5;
/*  391 */           paramInt5 += i3;
/*  392 */           paramInt8 += i8;
/*  393 */           paramInt2 += j;
/*      */         }
/*  395 */         return;
/*      */       }
/*      */ 
/*  398 */       paramInt3 -= paramInt1;
/*  399 */       paramInt1 -= paramInt2;
/*  400 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  402 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  403 */         paramInt6 += i4;
/*  404 */         paramInt5 += i3;
/*  405 */         paramInt8 += i8;
/*  406 */         paramInt2 += j; }
/*      */       while (true) {
/*  408 */         paramInt3--; if (paramInt3 < 0) break;
/*  409 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  410 */         paramInt4 += i5;
/*  411 */         paramInt5 += i3;
/*  412 */         paramInt8 += i8;
/*  413 */         paramInt2 += j;
/*      */       }
/*  415 */       return;
/*      */     }
/*      */ 
/*  420 */     if (paramInt3 >= p) return;
/*  421 */     if (paramInt1 > p) paramInt1 = p;
/*  422 */     if (paramInt2 > p) paramInt2 = p;
/*  423 */     paramInt9 = (paramInt9 << 8) - i7 * paramInt6 + i7;
/*  424 */     if (paramInt1 < paramInt2) {
/*  425 */       paramInt5 = paramInt6 <<= 16;
/*  426 */       if (paramInt3 < 0) {
/*  427 */         paramInt5 -= i3 * paramInt3;
/*  428 */         paramInt6 -= i5 * paramInt3;
/*  429 */         paramInt9 -= i8 * paramInt3;
/*  430 */         paramInt3 = 0;
/*      */       }
/*  432 */       paramInt4 <<= 16;
/*  433 */       if (paramInt1 < 0) {
/*  434 */         paramInt4 -= i4 * paramInt1;
/*  435 */         paramInt1 = 0;
/*      */       }
/*  437 */       if (i3 < i5) {
/*  438 */         paramInt2 -= paramInt1;
/*  439 */         paramInt1 -= paramInt3;
/*  440 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  442 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  443 */           paramInt5 += i3;
/*  444 */           paramInt6 += i5;
/*  445 */           paramInt9 += i8;
/*  446 */           paramInt3 += j; }
/*      */         while (true) {
/*  448 */           paramInt2--; if (paramInt2 < 0) break;
/*  449 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  450 */           paramInt5 += i3;
/*  451 */           paramInt4 += i4;
/*  452 */           paramInt9 += i8;
/*  453 */           paramInt3 += j;
/*      */         }
/*  455 */         return;
/*      */       }
/*      */ 
/*  458 */       paramInt2 -= paramInt1;
/*  459 */       paramInt1 -= paramInt3;
/*  460 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  462 */         cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  463 */         paramInt5 += i3;
/*  464 */         paramInt6 += i5;
/*  465 */         paramInt9 += i8;
/*  466 */         paramInt3 += j; }
/*      */       while (true) {
/*  468 */         paramInt2--; if (paramInt2 < 0) break;
/*  469 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  470 */         paramInt5 += i3;
/*  471 */         paramInt4 += i4;
/*  472 */         paramInt9 += i8;
/*  473 */         paramInt3 += j;
/*      */       }
/*  475 */       return;
/*      */     }
/*      */ 
/*  479 */     paramInt4 = paramInt6 <<= 16;
/*  480 */     if (paramInt3 < 0) {
/*  481 */       paramInt4 -= i3 * paramInt3;
/*  482 */       paramInt6 -= i5 * paramInt3;
/*  483 */       paramInt9 -= i8 * paramInt3;
/*  484 */       paramInt3 = 0;
/*      */     }
/*  486 */     paramInt5 <<= 16;
/*  487 */     if (paramInt2 < 0) {
/*  488 */       paramInt5 -= i4 * paramInt2;
/*  489 */       paramInt2 = 0;
/*      */     }
/*  491 */     if (i3 < i5) {
/*  492 */       paramInt1 -= paramInt2;
/*  493 */       paramInt2 -= paramInt3;
/*  494 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  496 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  497 */         paramInt4 += i3;
/*  498 */         paramInt6 += i5;
/*  499 */         paramInt9 += i8;
/*  500 */         paramInt3 += j; }
/*      */       while (true) {
/*  502 */         paramInt1--; if (paramInt1 < 0) break;
/*  503 */         cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  504 */         paramInt5 += i4;
/*  505 */         paramInt6 += i5;
/*  506 */         paramInt9 += i8;
/*  507 */         paramInt3 += j;
/*      */       }
/*  509 */       return;
/*      */     }
/*      */ 
/*  512 */     paramInt1 -= paramInt2;
/*  513 */     paramInt2 -= paramInt3;
/*  514 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  516 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  517 */       paramInt4 += i3;
/*  518 */       paramInt6 += i5;
/*  519 */       paramInt9 += i8;
/*  520 */       paramInt3 += j; }
/*      */     while (true) {
/*  522 */       paramInt1--; if (paramInt1 < 0) break;
/*  523 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  524 */       paramInt5 += i4;
/*  525 */       paramInt6 += i5;
/*  526 */       paramInt9 += i8;
/*  527 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final int cu(int paramInt1, int paramInt2)
/*      */   {
/* 2601 */     paramInt2 = paramInt2 * (paramInt1 & 0x7F) >> 7;
/* 2602 */     if (paramInt2 < 2) paramInt2 = 2;
/* 2603 */     else if (paramInt2 > 126) paramInt2 = 126;
/* 2604 */     return (paramInt1 & 0xFF80) + paramInt2;
/*      */   }
/*      */ 
/*      */   static
/*      */   {
/*   10 */     w = false;
/*   11 */     e = true;
/*   12 */     b = 0;
/*      */ 
/*   26 */     am = new int[1024];
/*   27 */     ap = new int[65536];
/*      */ 
/*   29 */     ak = new int[512];
/*   30 */     az = new int[2048];
/*   31 */     an = new int[2048];
/*   32 */     ah = new int[2048];
/*      */ 
/*   35 */     for (int i = 1; i < 512; i++) {
/*   36 */       ak[i] = (32768 / i);
/*      */     }
/*   38 */     for (i = 1; i < 2048; i++) {
/*   39 */       az[i] = (65536 / i);
/*      */     }
/*   41 */     for (i = 0; i < 2048; i++) {
/*   42 */       an[i] = ((int)(65536.0D * Math.sin(i * 0.0030679615D)));
/*   43 */       ah[i] = ((int)(65536.0D * Math.cos(i * 0.0030679615D)));
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void cc()
/*      */   {
/*   52 */     bn(i, g, s, q);
/*      */   }
/*      */ 
/*      */   public static final void cq(int paramInt1, int paramInt2)
/*      */   {
/*   90 */     int i = am[0];
/*   91 */     int j = i / j;
/*   92 */     int m = i - j * j;
/*   93 */     a = paramInt1 - m;
/*   94 */     h = paramInt2 - j;
/*   95 */     ad = -a;
/*   96 */     ac = x - a;
/*   97 */     aa = -h;
/*   98 */     as = p - h;
/*      */   }
/*      */ 
/*      */   public static final void cw()
/*      */   {
/*   52 */     bn(i, g, s, q); } 
/*   52 */   public static final void cz() { bn(i, g, s, q); }
/*      */ 
/*      */   static final void bn(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   56 */     x = paramInt3 - paramInt1;
/*   57 */     p = paramInt4 - paramInt2;
/*   58 */     be();
/*   59 */     if (am.length < p)
/*      */     {
/*   61 */       j = p;
/*      */ 
/*   63 */       j--;
/*   64 */       j |= j >>> 1;
/*   65 */       j |= j >>> 2;
/*   66 */       j |= j >>> 4;
/*   67 */       j |= j >>> 8;
/*   68 */       j |= j >>> 16;
/*   69 */       i = j + 1;
/*      */ 
/*   71 */       am = new int[i];
/*      */     }
/*   73 */     int i = paramInt2 * j + paramInt1;
/*   74 */     for (int j = 0; j < p; j++) {
/*   75 */       am[j] = i;
/*   76 */       i += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void ct(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   56 */     x = paramInt3 - paramInt1;
/*   57 */     p = paramInt4 - paramInt2;
/*   58 */     be();
/*   59 */     if (am.length < p)
/*      */     {
/*   61 */       j = p;
/*      */ 
/*   63 */       j--;
/*   64 */       j |= j >>> 1;
/*   65 */       j |= j >>> 2;
/*   66 */       j |= j >>> 4;
/*   67 */       j |= j >>> 8;
/*   68 */       j |= j >>> 16;
/*   69 */       i = j + 1;
/*      */ 
/*   71 */       am = new int[i];
/*      */     }
/*   73 */     int i = paramInt2 * j + paramInt1;
/*   74 */     for (int j = 0; j < p; j++) {
/*   75 */       am[j] = i;
/*   76 */       i += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void ck() {
/*   81 */     a = x / 2;
/*   82 */     h = p / 2;
/*   83 */     ad = -a;
/*   84 */     ac = x - a;
/*   85 */     aa = -h;
/*   86 */     as = p - h;
/*      */   }
/*      */ 
/*      */   public static final void cy(int paramInt1, int paramInt2) {
/*   90 */     int i = am[0];
/*   91 */     int j = i / j;
/*   92 */     int m = i - j * j;
/*   93 */     a = paramInt1 - m;
/*   94 */     h = paramInt2 - j;
/*   95 */     ad = -a;
/*   96 */     ac = x - a;
/*   97 */     aa = -h;
/*   98 */     as = p - h;
/*      */   }
/*      */ 
/*      */   static final void dn(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 2316 */     if (u) {
/* 2317 */       if (paramInt5 > x) paramInt5 = x;
/* 2318 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 2320 */     if (paramInt4 >= paramInt5) return;
/* 2321 */     paramInt3 += paramInt4;
/* 2322 */     paramInt6 += paramInt7 * paramInt4;
/* 2323 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 2324 */     if (w)
/*      */     {
/* 2331 */       i5 = paramInt4 - a;
/* 2332 */       paramInt8 += paramInt11 * i5;
/* 2333 */       paramInt9 += paramInt12 * i5;
/* 2334 */       paramInt10 += paramInt13 * i5;
/* 2335 */       i4 = paramInt10 >> 12;
/* 2336 */       if (i4 != 0) {
/* 2337 */         n = paramInt8 / i4;
/* 2338 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2341 */         n = 0;
/* 2342 */         i1 = 0;
/*      */       }
/* 2344 */       paramInt8 += paramInt11 * m;
/* 2345 */       paramInt9 += paramInt12 * m;
/* 2346 */       paramInt10 += paramInt13 * m;
/* 2347 */       i4 = paramInt10 >> 12;
/* 2348 */       if (i4 != 0) {
/* 2349 */         i2 = paramInt8 / i4;
/* 2350 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2353 */         i2 = 0;
/* 2354 */         i3 = 0;
/*      */       }
/* 2356 */       paramInt1 = (n << 20) + i1;
/* 2357 */       j = ((i2 - n) / m << 20) + (i3 - i1) / m;
/* 2358 */       m >>= 3;
/* 2359 */       paramInt7 <<= 3;
/* 2360 */       i = paramInt6 >> 8;
/*      */ 
/* 2362 */       if (v) {
/* 2363 */         if (m > 0) {
/*      */           do {
/* 2365 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2366 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2367 */             paramInt1 += j;
/* 2368 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2369 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2370 */             paramInt1 += j;
/* 2371 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2372 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2373 */             paramInt1 += j;
/* 2374 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2375 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2376 */             paramInt1 += j;
/* 2377 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2378 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2379 */             paramInt1 += j;
/* 2380 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2381 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2382 */             paramInt1 += j;
/* 2383 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2384 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2385 */             paramInt1 += j;
/* 2386 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2387 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2388 */             paramInt1 += j;
/* 2389 */             paramInt6 += paramInt7;
/* 2390 */             i = paramInt6 >> 8;
/* 2391 */             m--; } while (m > 0);
/*      */         }
/* 2393 */         m = paramInt5 - paramInt4 & 0x7;
/* 2394 */         if (m > 0)
/*      */           do {
/* 2396 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2397 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2398 */             paramInt1 += j;
/* 2399 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2403 */         if (m > 0) {
/*      */           do {
/* 2405 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2406 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2408 */             paramInt3++;
/* 2409 */             paramInt1 += j;
/* 2410 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2411 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2413 */             paramInt3++;
/* 2414 */             paramInt1 += j;
/* 2415 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2416 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2418 */             paramInt3++;
/* 2419 */             paramInt1 += j;
/* 2420 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2421 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2423 */             paramInt3++;
/* 2424 */             paramInt1 += j;
/* 2425 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2426 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2428 */             paramInt3++;
/* 2429 */             paramInt1 += j;
/* 2430 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2431 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2433 */             paramInt3++;
/* 2434 */             paramInt1 += j;
/* 2435 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2436 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2438 */             paramInt3++;
/* 2439 */             paramInt1 += j;
/* 2440 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2441 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2443 */             paramInt3++;
/* 2444 */             paramInt1 += j;
/* 2445 */             paramInt6 += paramInt7;
/* 2446 */             i = paramInt6 >> 8;
/* 2447 */             m--; } while (m > 0);
/*      */         }
/* 2449 */         m = paramInt5 - paramInt4 & 0x7;
/* 2450 */         if (m > 0) {
/*      */           do {
/* 2452 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2453 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2455 */             paramInt3++;
/* 2456 */             paramInt1 += j;
/* 2457 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 2468 */       i5 = paramInt4 - a;
/* 2469 */       paramInt8 += paramInt11 * i5;
/* 2470 */       paramInt9 += paramInt12 * i5;
/* 2471 */       paramInt10 += paramInt13 * i5;
/* 2472 */       i4 = paramInt10 >> 14;
/* 2473 */       if (i4 != 0) {
/* 2474 */         n = paramInt8 / i4;
/* 2475 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2478 */         n = 0;
/* 2479 */         i1 = 0;
/*      */       }
/* 2481 */       paramInt8 += paramInt11 * m;
/* 2482 */       paramInt9 += paramInt12 * m;
/* 2483 */       paramInt10 += paramInt13 * m;
/* 2484 */       i4 = paramInt10 >> 14;
/* 2485 */       if (i4 != 0) {
/* 2486 */         i2 = paramInt8 / i4;
/* 2487 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2490 */         i2 = 0;
/* 2491 */         i3 = 0;
/*      */       }
/* 2493 */       paramInt1 = (n << 18) + i1;
/* 2494 */       j = ((i2 - n) / m << 18) + (i3 - i1) / m;
/* 2495 */       m >>= 3;
/* 2496 */       paramInt7 <<= 3;
/* 2497 */       i = paramInt6 >> 8;
/*      */ 
/* 2499 */       if (v) {
/* 2500 */         if (m > 0) {
/*      */           do {
/* 2502 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2503 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2504 */             paramInt1 += j;
/* 2505 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2506 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2507 */             paramInt1 += j;
/* 2508 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2509 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2510 */             paramInt1 += j;
/* 2511 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2512 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2513 */             paramInt1 += j;
/* 2514 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2515 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2516 */             paramInt1 += j;
/* 2517 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2518 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2519 */             paramInt1 += j;
/* 2520 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2521 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2522 */             paramInt1 += j;
/* 2523 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2524 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2525 */             paramInt1 += j;
/* 2526 */             paramInt6 += paramInt7;
/* 2527 */             i = paramInt6 >> 8;
/* 2528 */             m--; } while (m > 0);
/*      */         }
/* 2530 */         m = paramInt5 - paramInt4 & 0x7;
/* 2531 */         if (m > 0)
/*      */           do {
/* 2533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2535 */             paramInt1 += j;
/* 2536 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2540 */         if (m > 0) {
/*      */           do {
/* 2542 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2543 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2545 */             paramInt3++;
/* 2546 */             paramInt1 += j;
/* 2547 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2548 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2550 */             paramInt3++;
/* 2551 */             paramInt1 += j;
/* 2552 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2553 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2555 */             paramInt3++;
/* 2556 */             paramInt1 += j;
/* 2557 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2558 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2560 */             paramInt3++;
/* 2561 */             paramInt1 += j;
/* 2562 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2563 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2565 */             paramInt3++;
/* 2566 */             paramInt1 += j;
/* 2567 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2568 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2570 */             paramInt3++;
/* 2571 */             paramInt1 += j;
/* 2572 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2573 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2575 */             paramInt3++;
/* 2576 */             paramInt1 += j;
/* 2577 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2578 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2580 */             paramInt3++;
/* 2581 */             paramInt1 += j;
/* 2582 */             paramInt6 += paramInt7;
/* 2583 */             i = paramInt6 >> 8;
/* 2584 */             m--; } while (m > 0);
/*      */         }
/* 2586 */         m = paramInt5 - paramInt4 & 0x7;
/* 2587 */         if (m > 0)
/*      */           do {
/* 2589 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2590 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2592 */             paramInt3++;
/* 2593 */             paramInt1 += j;
/* 2594 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void cd(aw paramaw)
/*      */   {
/*  102 */     av = paramaw;
/*      */   }
/*      */ 
/*      */   public static final void bp(int paramInt1, int paramInt2)
/*      */   {
/*   90 */     int i = am[0];
/*   91 */     int j = i / j;
/*   92 */     int m = i - j * j;
/*   93 */     a = paramInt1 - m;
/*   94 */     h = paramInt2 - j;
/*   95 */     ad = -a;
/*   96 */     ac = x - a;
/*   97 */     aa = -h;
/*   98 */     as = p - h;
/*      */   }
/*      */ 
/*      */   public static final void cn(double paramDouble)
/*      */   {
/*  106 */     br(paramDouble, 0, 512);
/*      */   }
/*      */ 
/*      */   static final void cv(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   56 */     x = paramInt3 - paramInt1;
/*   57 */     p = paramInt4 - paramInt2;
/*   58 */     be();
/*   59 */     if (am.length < p)
/*      */     {
/*   61 */       j = p;
/*      */ 
/*   63 */       j--;
/*   64 */       j |= j >>> 1;
/*   65 */       j |= j >>> 2;
/*   66 */       j |= j >>> 4;
/*   67 */       j |= j >>> 8;
/*   68 */       j |= j >>> 16;
/*   69 */       i = j + 1;
/*      */ 
/*   71 */       am = new int[i];
/*      */     }
/*   73 */     int i = paramInt2 * j + paramInt1;
/*   74 */     for (int j = 0; j < p; j++) {
/*   75 */       am[j] = i;
/*   76 */       i += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void ci(double paramDouble, int paramInt1, int paramInt2)
/*      */   {
/*  110 */     paramDouble += Math.random() * 0.03D - 0.015D;
/*  111 */     int i = paramInt1 * 128;
/*  112 */     for (int j = paramInt1; j < paramInt2; j++) {
/*  113 */       double d1 = (j >> 3) / 64.0D + 0.0078125D;
/*  114 */       double d2 = (j & 0x7) / 8.0D + 0.0625D;
/*  115 */       for (int m = 0; m < 128; m++) {
/*  116 */         double d3 = m / 128.0D;
/*  117 */         double d4 = d3;
/*  118 */         double d5 = d3;
/*  119 */         double d6 = d3;
/*  120 */         if (d2 != 0.0D)
/*      */         {
/*  122 */           double d7;
/*  122 */           if (d3 < 0.5D) d7 = d3 * (1.0D + d2); else
/*  123 */             d7 = d3 + d2 - d3 * d2;
/*  124 */           double d8 = 2.0D * d3 - d7;
/*  125 */           double d9 = d1 + 0.3333333333333333D;
/*  126 */           if (d9 > 1.0D) d9 -= 1.0D;
/*  127 */           double d10 = d1;
/*  128 */           double d11 = d1 - 0.3333333333333333D;
/*  129 */           if (d11 < 0.0D) d11 += 1.0D;
/*  130 */           if (6.0D * d9 < 1.0D) d4 = d8 + (d7 - d8) * 6.0D * d9;
/*  131 */           else if (2.0D * d9 < 1.0D) d4 = d7;
/*  132 */           else if (3.0D * d9 < 2.0D) d4 = d8 + (d7 - d8) * (0.6666666666666666D - d9) * 6.0D; else
/*  133 */             d4 = d8;
/*  134 */           if (6.0D * d10 < 1.0D) d5 = d8 + (d7 - d8) * 6.0D * d10;
/*  135 */           else if (2.0D * d10 < 1.0D) d5 = d7;
/*  136 */           else if (3.0D * d10 < 2.0D) d5 = d8 + (d7 - d8) * (0.6666666666666666D - d10) * 6.0D; else
/*  137 */             d5 = d8;
/*  138 */           if (6.0D * d11 < 1.0D) d6 = d8 + (d7 - d8) * 6.0D * d11;
/*  139 */           else if (2.0D * d11 < 1.0D) d6 = d7;
/*  140 */           else if (3.0D * d11 < 2.0D) d6 = d8 + (d7 - d8) * (0.6666666666666666D - d11) * 6.0D; else
/*  141 */             d6 = d8;
/*      */         }
/*  143 */         int n = (int)(d4 * 256.0D);
/*  144 */         int i1 = (int)(d5 * 256.0D);
/*  145 */         int i2 = (int)(d6 * 256.0D);
/*  146 */         int i3 = (n << 16) + (i1 << 8) + i2;
/*  147 */         i3 = bb(i3, paramDouble);
/*  148 */         if (i3 == 0) i3 = 1;
/*  149 */         ap[(i++)] = i3;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static int cb(int paramInt, double paramDouble) {
/*  155 */     double d1 = (paramInt >> 16) / 256.0D;
/*  156 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/*  157 */     double d3 = (paramInt & 0xFF) / 256.0D;
/*  158 */     d1 = Math.pow(d1, paramDouble);
/*  159 */     d2 = Math.pow(d2, paramDouble);
/*  160 */     d3 = Math.pow(d3, paramDouble);
/*  161 */     int i = (int)(d1 * 256.0D);
/*  162 */     int j = (int)(d2 * 256.0D);
/*  163 */     int m = (int)(d3 * 256.0D);
/*  164 */     return (i << 16) + (j << 8) + m;
/*      */   }
/*      */ 
/*      */   static int cf(int paramInt, double paramDouble)
/*      */   {
/*  155 */     double d1 = (paramInt >> 16) / 256.0D;
/*  156 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/*  157 */     double d3 = (paramInt & 0xFF) / 256.0D;
/*  158 */     d1 = Math.pow(d1, paramDouble);
/*  159 */     d2 = Math.pow(d2, paramDouble);
/*  160 */     d3 = Math.pow(d3, paramDouble);
/*  161 */     int i = (int)(d1 * 256.0D);
/*  162 */     int j = (int)(d2 * 256.0D);
/*  163 */     int m = (int)(d3 * 256.0D);
/*  164 */     return (i << 16) + (j << 8) + m;
/*      */   }
/*      */ 
/*      */   static int cg(int paramInt, double paramDouble)
/*      */   {
/*  155 */     double d1 = (paramInt >> 16) / 256.0D;
/*  156 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/*  157 */     double d3 = (paramInt & 0xFF) / 256.0D;
/*  158 */     d1 = Math.pow(d1, paramDouble);
/*  159 */     d2 = Math.pow(d2, paramDouble);
/*  160 */     d3 = Math.pow(d3, paramDouble);
/*  161 */     int i = (int)(d1 * 256.0D);
/*  162 */     int j = (int)(d2 * 256.0D);
/*  163 */     int m = (int)(d3 * 256.0D);
/*  164 */     return (i << 16) + (j << 8) + m;
/*      */   }
/*      */ 
/*      */   fx()
/*      */     throws Throwable
/*      */   {
/*   48 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static void dg(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  168 */     u = (paramInt1 < 0) || (paramInt1 > x) || (paramInt2 < 0) || (paramInt2 > x) || (paramInt3 < 0) || (paramInt3 > x); } 
/*  168 */   public static void df(int paramInt1, int paramInt2, int paramInt3) { u = (paramInt1 < 0) || (paramInt1 > x) || (paramInt2 < 0) || (paramInt2 > x) || (paramInt3 < 0) || (paramInt3 > x); }
/*      */ 
/*      */ 
/*      */   static final void dy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19)
/*      */   {
/* 1834 */     int[] arrayOfInt = av.r(paramInt19, -112476939);
/* 1835 */     if (arrayOfInt == null) {
/* 1836 */       i = av.d(paramInt19, -2124395279);
/* 1837 */       cr(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, cu(i, paramInt7), cu(i, paramInt8), cu(i, paramInt9));
/* 1838 */       return;
/*      */     }
/* 1840 */     w = av.m(paramInt19, 1469163435);
/* 1841 */     v = av.l(paramInt19, 148362010);
/* 1842 */     int i = paramInt5 - paramInt4;
/* 1843 */     int j = paramInt2 - paramInt1;
/* 1844 */     int m = paramInt6 - paramInt4;
/* 1845 */     int n = paramInt3 - paramInt1;
/* 1846 */     int i1 = paramInt8 - paramInt7;
/* 1847 */     int i2 = paramInt9 - paramInt7;
/* 1848 */     int i3 = 0;
/* 1849 */     if (paramInt2 != paramInt1) i3 = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/* 1850 */     int i4 = 0;
/* 1851 */     if (paramInt3 != paramInt2) i4 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/* 1852 */     int i5 = 0;
/* 1853 */     if (paramInt3 != paramInt1) i5 = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/* 1854 */     int i6 = i * n - m * j;
/* 1855 */     if (i6 == 0) return;
/* 1856 */     int i7 = (i1 * n - i2 * j << 9) / i6;
/* 1857 */     int i8 = (i2 * i - i1 * m << 9) / i6;
/* 1858 */     paramInt11 = paramInt10 - paramInt11;
/* 1859 */     paramInt14 = paramInt13 - paramInt14;
/* 1860 */     paramInt17 = paramInt16 - paramInt17;
/* 1861 */     paramInt12 -= paramInt10;
/* 1862 */     paramInt15 -= paramInt13;
/* 1863 */     paramInt18 -= paramInt16;
/* 1864 */     int i9 = paramInt12 * paramInt13 - paramInt15 * paramInt10 << 14;
/* 1865 */     int i10 = paramInt15 * paramInt16 - paramInt18 * paramInt13 << 5;
/* 1866 */     int i11 = paramInt18 * paramInt10 - paramInt12 * paramInt16 << 5;
/* 1867 */     int i12 = paramInt11 * paramInt13 - paramInt14 * paramInt10 << 14;
/* 1868 */     int i13 = paramInt14 * paramInt16 - paramInt17 * paramInt13 << 5;
/* 1869 */     int i14 = paramInt17 * paramInt10 - paramInt11 * paramInt16 << 5;
/* 1870 */     int i15 = paramInt14 * paramInt12 - paramInt11 * paramInt15 << 14;
/* 1871 */     int i16 = paramInt17 * paramInt15 - paramInt14 * paramInt18 << 5;
/* 1872 */     int i17 = paramInt11 * paramInt18 - paramInt17 * paramInt12 << 5;
/* 1873 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/* 1874 */       if (paramInt1 >= p) return;
/* 1875 */       if (paramInt2 > p) paramInt2 = p;
/* 1876 */       if (paramInt3 > p) paramInt3 = p;
/* 1877 */       paramInt7 = (paramInt7 << 9) - i7 * paramInt4 + i7;
/* 1878 */       if (paramInt2 < paramInt3) {
/* 1879 */         paramInt6 = paramInt4 <<= 16;
/* 1880 */         if (paramInt1 < 0) {
/* 1881 */           paramInt6 -= i5 * paramInt1;
/* 1882 */           paramInt4 -= i3 * paramInt1;
/* 1883 */           paramInt7 -= i8 * paramInt1;
/* 1884 */           paramInt1 = 0;
/*      */         }
/* 1886 */         paramInt5 <<= 16;
/* 1887 */         if (paramInt2 < 0) {
/* 1888 */           paramInt5 -= i4 * paramInt2;
/* 1889 */           paramInt2 = 0;
/*      */         }
/* 1891 */         i18 = paramInt1 - h;
/* 1892 */         i9 += i11 * i18;
/* 1893 */         i12 += i14 * i18;
/* 1894 */         i15 += i17 * i18;
/* 1895 */         if (((paramInt1 != paramInt2) && (i5 < i3)) || ((paramInt1 == paramInt2) && (i5 > i4))) {
/* 1896 */           paramInt3 -= paramInt2;
/* 1897 */           paramInt2 -= paramInt1;
/* 1898 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1900 */             ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1901 */             paramInt6 += i5;
/* 1902 */             paramInt4 += i3;
/* 1903 */             paramInt7 += i8;
/* 1904 */             paramInt1 += j;
/* 1905 */             i9 += i11;
/* 1906 */             i12 += i14;
/* 1907 */             i15 += i17; }
/*      */           while (true) {
/* 1909 */             paramInt3--; if (paramInt3 < 0) break;
/* 1910 */             ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1911 */             paramInt6 += i5;
/* 1912 */             paramInt5 += i4;
/* 1913 */             paramInt7 += i8;
/* 1914 */             paramInt1 += j;
/* 1915 */             i9 += i11;
/* 1916 */             i12 += i14;
/* 1917 */             i15 += i17;
/*      */           }
/* 1919 */           return;
/*      */         }
/*      */ 
/* 1922 */         paramInt3 -= paramInt2;
/* 1923 */         paramInt2 -= paramInt1;
/* 1924 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1926 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1927 */           paramInt6 += i5;
/* 1928 */           paramInt4 += i3;
/* 1929 */           paramInt7 += i8;
/* 1930 */           paramInt1 += j;
/* 1931 */           i9 += i11;
/* 1932 */           i12 += i14;
/* 1933 */           i15 += i17; }
/*      */         while (true) {
/* 1935 */           paramInt3--; if (paramInt3 < 0) break;
/* 1936 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1937 */           paramInt6 += i5;
/* 1938 */           paramInt5 += i4;
/* 1939 */           paramInt7 += i8;
/* 1940 */           paramInt1 += j;
/* 1941 */           i9 += i11;
/* 1942 */           i12 += i14;
/* 1943 */           i15 += i17;
/*      */         }
/* 1945 */         return;
/*      */       }
/*      */ 
/* 1949 */       paramInt5 = paramInt4 <<= 16;
/* 1950 */       if (paramInt1 < 0) {
/* 1951 */         paramInt5 -= i5 * paramInt1;
/* 1952 */         paramInt4 -= i3 * paramInt1;
/* 1953 */         paramInt7 -= i8 * paramInt1;
/* 1954 */         paramInt1 = 0;
/*      */       }
/* 1956 */       paramInt6 <<= 16;
/* 1957 */       if (paramInt3 < 0) {
/* 1958 */         paramInt6 -= i4 * paramInt3;
/* 1959 */         paramInt3 = 0;
/*      */       }
/* 1961 */       i18 = paramInt1 - h;
/* 1962 */       i9 += i11 * i18;
/* 1963 */       i12 += i14 * i18;
/* 1964 */       i15 += i17 * i18;
/* 1965 */       if (((paramInt1 != paramInt3) && (i5 < i3)) || ((paramInt1 == paramInt3) && (i4 > i3))) {
/* 1966 */         paramInt2 -= paramInt3;
/* 1967 */         paramInt3 -= paramInt1;
/* 1968 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1970 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1971 */           paramInt5 += i5;
/* 1972 */           paramInt4 += i3;
/* 1973 */           paramInt7 += i8;
/* 1974 */           paramInt1 += j;
/* 1975 */           i9 += i11;
/* 1976 */           i12 += i14;
/* 1977 */           i15 += i17; }
/*      */         while (true) {
/* 1979 */           paramInt2--; if (paramInt2 < 0) break;
/* 1980 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1981 */           paramInt6 += i4;
/* 1982 */           paramInt4 += i3;
/* 1983 */           paramInt7 += i8;
/* 1984 */           paramInt1 += j;
/* 1985 */           i9 += i11;
/* 1986 */           i12 += i14;
/* 1987 */           i15 += i17;
/*      */         }
/* 1989 */         return;
/*      */       }
/*      */ 
/* 1992 */       paramInt2 -= paramInt3;
/* 1993 */       paramInt3 -= paramInt1;
/* 1994 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1996 */         ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1997 */         paramInt5 += i5;
/* 1998 */         paramInt4 += i3;
/* 1999 */         paramInt7 += i8;
/* 2000 */         paramInt1 += j;
/* 2001 */         i9 += i11;
/* 2002 */         i12 += i14;
/* 2003 */         i15 += i17; }
/*      */       while (true) {
/* 2005 */         paramInt2--; if (paramInt2 < 0) break;
/* 2006 */         ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 2007 */         paramInt6 += i4;
/* 2008 */         paramInt4 += i3;
/* 2009 */         paramInt7 += i8;
/* 2010 */         paramInt1 += j;
/* 2011 */         i9 += i11;
/* 2012 */         i12 += i14;
/* 2013 */         i15 += i17;
/*      */       }
/* 2015 */       return;
/*      */     }
/*      */ 
/* 2019 */     if (paramInt2 <= paramInt3) {
/* 2020 */       if (paramInt2 >= p) return;
/* 2021 */       if (paramInt3 > p) paramInt3 = p;
/* 2022 */       if (paramInt1 > p) paramInt1 = p;
/* 2023 */       paramInt8 = (paramInt8 << 9) - i7 * paramInt5 + i7;
/* 2024 */       if (paramInt3 < paramInt1) {
/* 2025 */         paramInt4 = paramInt5 <<= 16;
/* 2026 */         if (paramInt2 < 0) {
/* 2027 */           paramInt4 -= i3 * paramInt2;
/* 2028 */           paramInt5 -= i4 * paramInt2;
/* 2029 */           paramInt8 -= i8 * paramInt2;
/* 2030 */           paramInt2 = 0;
/*      */         }
/* 2032 */         paramInt6 <<= 16;
/* 2033 */         if (paramInt3 < 0) {
/* 2034 */           paramInt6 -= i5 * paramInt3;
/* 2035 */           paramInt3 = 0;
/*      */         }
/* 2037 */         i18 = paramInt2 - h;
/* 2038 */         i9 += i11 * i18;
/* 2039 */         i12 += i14 * i18;
/* 2040 */         i15 += i17 * i18;
/* 2041 */         if (((paramInt2 != paramInt3) && (i3 < i4)) || ((paramInt2 == paramInt3) && (i3 > i5))) {
/* 2042 */           paramInt1 -= paramInt3;
/* 2043 */           paramInt3 -= paramInt2;
/* 2044 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 2046 */             ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2047 */             paramInt4 += i3;
/* 2048 */             paramInt5 += i4;
/* 2049 */             paramInt8 += i8;
/* 2050 */             paramInt2 += j;
/* 2051 */             i9 += i11;
/* 2052 */             i12 += i14;
/* 2053 */             i15 += i17; }
/*      */           while (true) {
/* 2055 */             paramInt1--; if (paramInt1 < 0) break;
/* 2056 */             ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2057 */             paramInt4 += i3;
/* 2058 */             paramInt6 += i5;
/* 2059 */             paramInt8 += i8;
/* 2060 */             paramInt2 += j;
/* 2061 */             i9 += i11;
/* 2062 */             i12 += i14;
/* 2063 */             i15 += i17;
/*      */           }
/* 2065 */           return;
/*      */         }
/*      */ 
/* 2068 */         paramInt1 -= paramInt3;
/* 2069 */         paramInt3 -= paramInt2;
/* 2070 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 2072 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2073 */           paramInt4 += i3;
/* 2074 */           paramInt5 += i4;
/* 2075 */           paramInt8 += i8;
/* 2076 */           paramInt2 += j;
/* 2077 */           i9 += i11;
/* 2078 */           i12 += i14;
/* 2079 */           i15 += i17; }
/*      */         while (true) {
/* 2081 */           paramInt1--; if (paramInt1 < 0) break;
/* 2082 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2083 */           paramInt4 += i3;
/* 2084 */           paramInt6 += i5;
/* 2085 */           paramInt8 += i8;
/* 2086 */           paramInt2 += j;
/* 2087 */           i9 += i11;
/* 2088 */           i12 += i14;
/* 2089 */           i15 += i17;
/*      */         }
/* 2091 */         return;
/*      */       }
/*      */ 
/* 2095 */       paramInt6 = paramInt5 <<= 16;
/* 2096 */       if (paramInt2 < 0) {
/* 2097 */         paramInt6 -= i3 * paramInt2;
/* 2098 */         paramInt5 -= i4 * paramInt2;
/* 2099 */         paramInt8 -= i8 * paramInt2;
/* 2100 */         paramInt2 = 0;
/*      */       }
/* 2102 */       paramInt4 <<= 16;
/* 2103 */       if (paramInt1 < 0) {
/* 2104 */         paramInt4 -= i5 * paramInt1;
/* 2105 */         paramInt1 = 0;
/*      */       }
/* 2107 */       i18 = paramInt2 - h;
/* 2108 */       i9 += i11 * i18;
/* 2109 */       i12 += i14 * i18;
/* 2110 */       i15 += i17 * i18;
/* 2111 */       if (i3 < i4) {
/* 2112 */         paramInt3 -= paramInt1;
/* 2113 */         paramInt1 -= paramInt2;
/* 2114 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2116 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2117 */           paramInt6 += i3;
/* 2118 */           paramInt5 += i4;
/* 2119 */           paramInt8 += i8;
/* 2120 */           paramInt2 += j;
/* 2121 */           i9 += i11;
/* 2122 */           i12 += i14;
/* 2123 */           i15 += i17; }
/*      */         while (true) {
/* 2125 */           paramInt3--; if (paramInt3 < 0) break;
/* 2126 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2127 */           paramInt4 += i5;
/* 2128 */           paramInt5 += i4;
/* 2129 */           paramInt8 += i8;
/* 2130 */           paramInt2 += j;
/* 2131 */           i9 += i11;
/* 2132 */           i12 += i14;
/* 2133 */           i15 += i17;
/*      */         }
/* 2135 */         return;
/*      */       }
/*      */ 
/* 2138 */       paramInt3 -= paramInt1;
/* 2139 */       paramInt1 -= paramInt2;
/* 2140 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2142 */         ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2143 */         paramInt6 += i3;
/* 2144 */         paramInt5 += i4;
/* 2145 */         paramInt8 += i8;
/* 2146 */         paramInt2 += j;
/* 2147 */         i9 += i11;
/* 2148 */         i12 += i14;
/* 2149 */         i15 += i17; }
/*      */       while (true) {
/* 2151 */         paramInt3--; if (paramInt3 < 0) break;
/* 2152 */         ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2153 */         paramInt4 += i5;
/* 2154 */         paramInt5 += i4;
/* 2155 */         paramInt8 += i8;
/* 2156 */         paramInt2 += j;
/* 2157 */         i9 += i11;
/* 2158 */         i12 += i14;
/* 2159 */         i15 += i17;
/*      */       }
/* 2161 */       return;
/*      */     }
/*      */ 
/* 2166 */     if (paramInt3 >= p) return;
/* 2167 */     if (paramInt1 > p) paramInt1 = p;
/* 2168 */     if (paramInt2 > p) paramInt2 = p;
/* 2169 */     paramInt9 = (paramInt9 << 9) - i7 * paramInt6 + i7;
/* 2170 */     if (paramInt1 < paramInt2) {
/* 2171 */       paramInt5 = paramInt6 <<= 16;
/* 2172 */       if (paramInt3 < 0) {
/* 2173 */         paramInt5 -= i4 * paramInt3;
/* 2174 */         paramInt6 -= i5 * paramInt3;
/* 2175 */         paramInt9 -= i8 * paramInt3;
/* 2176 */         paramInt3 = 0;
/*      */       }
/* 2178 */       paramInt4 <<= 16;
/* 2179 */       if (paramInt1 < 0) {
/* 2180 */         paramInt4 -= i3 * paramInt1;
/* 2181 */         paramInt1 = 0;
/*      */       }
/* 2183 */       i18 = paramInt3 - h;
/* 2184 */       i9 += i11 * i18;
/* 2185 */       i12 += i14 * i18;
/* 2186 */       i15 += i17 * i18;
/* 2187 */       if (i4 < i5) {
/* 2188 */         paramInt2 -= paramInt1;
/* 2189 */         paramInt1 -= paramInt3;
/* 2190 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2192 */           ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2193 */           paramInt5 += i4;
/* 2194 */           paramInt6 += i5;
/* 2195 */           paramInt9 += i8;
/* 2196 */           paramInt3 += j;
/* 2197 */           i9 += i11;
/* 2198 */           i12 += i14;
/* 2199 */           i15 += i17; }
/*      */         while (true) {
/* 2201 */           paramInt2--; if (paramInt2 < 0) break;
/* 2202 */           ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2203 */           paramInt5 += i4;
/* 2204 */           paramInt4 += i3;
/* 2205 */           paramInt9 += i8;
/* 2206 */           paramInt3 += j;
/* 2207 */           i9 += i11;
/* 2208 */           i12 += i14;
/* 2209 */           i15 += i17;
/*      */         }
/* 2211 */         return;
/*      */       }
/*      */ 
/* 2214 */       paramInt2 -= paramInt1;
/* 2215 */       paramInt1 -= paramInt3;
/* 2216 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2218 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2219 */         paramInt5 += i4;
/* 2220 */         paramInt6 += i5;
/* 2221 */         paramInt9 += i8;
/* 2222 */         paramInt3 += j;
/* 2223 */         i9 += i11;
/* 2224 */         i12 += i14;
/* 2225 */         i15 += i17; }
/*      */       while (true) {
/* 2227 */         paramInt2--; if (paramInt2 < 0) break;
/* 2228 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2229 */         paramInt5 += i4;
/* 2230 */         paramInt4 += i3;
/* 2231 */         paramInt9 += i8;
/* 2232 */         paramInt3 += j;
/* 2233 */         i9 += i11;
/* 2234 */         i12 += i14;
/* 2235 */         i15 += i17;
/*      */       }
/* 2237 */       return;
/*      */     }
/*      */ 
/* 2241 */     paramInt4 = paramInt6 <<= 16;
/* 2242 */     if (paramInt3 < 0) {
/* 2243 */       paramInt4 -= i4 * paramInt3;
/* 2244 */       paramInt6 -= i5 * paramInt3;
/* 2245 */       paramInt9 -= i8 * paramInt3;
/* 2246 */       paramInt3 = 0;
/*      */     }
/* 2248 */     paramInt5 <<= 16;
/* 2249 */     if (paramInt2 < 0) {
/* 2250 */       paramInt5 -= i3 * paramInt2;
/* 2251 */       paramInt2 = 0;
/*      */     }
/* 2253 */     int i18 = paramInt3 - h;
/* 2254 */     i9 += i11 * i18;
/* 2255 */     i12 += i14 * i18;
/* 2256 */     i15 += i17 * i18;
/* 2257 */     if (i4 < i5) {
/* 2258 */       paramInt1 -= paramInt2;
/* 2259 */       paramInt2 -= paramInt3;
/* 2260 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 2262 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2263 */         paramInt4 += i4;
/* 2264 */         paramInt6 += i5;
/* 2265 */         paramInt9 += i8;
/* 2266 */         paramInt3 += j;
/* 2267 */         i9 += i11;
/* 2268 */         i12 += i14;
/* 2269 */         i15 += i17; }
/*      */       while (true) {
/* 2271 */         paramInt1--; if (paramInt1 < 0) break;
/* 2272 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2273 */         paramInt5 += i3;
/* 2274 */         paramInt6 += i5;
/* 2275 */         paramInt9 += i8;
/* 2276 */         paramInt3 += j;
/* 2277 */         i9 += i11;
/* 2278 */         i12 += i14;
/* 2279 */         i15 += i17;
/*      */       }
/* 2281 */       return;
/*      */     }
/*      */ 
/* 2284 */     paramInt1 -= paramInt2;
/* 2285 */     paramInt2 -= paramInt3;
/* 2286 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 2288 */       ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2289 */       paramInt4 += i4;
/* 2290 */       paramInt6 += i5;
/* 2291 */       paramInt9 += i8;
/* 2292 */       paramInt3 += j;
/* 2293 */       i9 += i11;
/* 2294 */       i12 += i14;
/* 2295 */       i15 += i17; }
/*      */     while (true) {
/* 2297 */       paramInt1--; if (paramInt1 < 0) break;
/* 2298 */       ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2299 */       paramInt5 += i3;
/* 2300 */       paramInt6 += i5;
/* 2301 */       paramInt9 += i8;
/* 2302 */       paramInt3 += j;
/* 2303 */       i9 += i11;
/* 2304 */       i12 += i14;
/* 2305 */       i15 += i17;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void cr(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*  172 */     int i = paramInt5 - paramInt4;
/*  173 */     int j = paramInt2 - paramInt1;
/*  174 */     int m = paramInt6 - paramInt4;
/*  175 */     int n = paramInt3 - paramInt1;
/*  176 */     int i1 = paramInt8 - paramInt7;
/*  177 */     int i2 = paramInt9 - paramInt7;
/*      */     int i3;
/*  179 */     if (paramInt3 != paramInt2) i3 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2); else
/*  180 */       i3 = 0;
/*  182 */     int i4;
/*  182 */     if (paramInt2 != paramInt1) i4 = (i << 16) / j; else
/*  183 */       i4 = 0;
/*  185 */     int i5;
/*  185 */     if (paramInt3 != paramInt1) i5 = (m << 16) / n; else
/*  186 */       i5 = 0;
/*  187 */     int i6 = i * n - m * j;
/*  188 */     if (i6 == 0) return;
/*  189 */     int i7 = (i1 * n - i2 * j << 8) / i6;
/*  190 */     int i8 = (i2 * i - i1 * m << 8) / i6;
/*  191 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  192 */       if (paramInt1 >= p) return;
/*  193 */       if (paramInt2 > p) paramInt2 = p;
/*  194 */       if (paramInt3 > p) paramInt3 = p;
/*  195 */       paramInt7 = (paramInt7 << 8) - i7 * paramInt4 + i7;
/*  196 */       if (paramInt2 < paramInt3) {
/*  197 */         paramInt6 = paramInt4 <<= 16;
/*  198 */         if (paramInt1 < 0) {
/*  199 */           paramInt6 -= i5 * paramInt1;
/*  200 */           paramInt4 -= i4 * paramInt1;
/*  201 */           paramInt7 -= i8 * paramInt1;
/*  202 */           paramInt1 = 0;
/*      */         }
/*  204 */         paramInt5 <<= 16;
/*  205 */         if (paramInt2 < 0) {
/*  206 */           paramInt5 -= i3 * paramInt2;
/*  207 */           paramInt2 = 0;
/*      */         }
/*  209 */         if (((paramInt1 != paramInt2) && (i5 < i4)) || ((paramInt1 == paramInt2) && (i5 > i3))) {
/*  210 */           paramInt3 -= paramInt2;
/*  211 */           paramInt2 -= paramInt1;
/*  212 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  214 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  215 */             paramInt6 += i5;
/*  216 */             paramInt4 += i4;
/*  217 */             paramInt7 += i8;
/*  218 */             paramInt1 += j; }
/*      */           while (true) {
/*  220 */             paramInt3--; if (paramInt3 < 0) break;
/*  221 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  222 */             paramInt6 += i5;
/*  223 */             paramInt5 += i3;
/*  224 */             paramInt7 += i8;
/*  225 */             paramInt1 += j;
/*      */           }
/*  227 */           return;
/*      */         }
/*      */ 
/*  230 */         paramInt3 -= paramInt2;
/*  231 */         paramInt2 -= paramInt1;
/*  232 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  234 */           cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  235 */           paramInt6 += i5;
/*  236 */           paramInt4 += i4;
/*  237 */           paramInt7 += i8;
/*  238 */           paramInt1 += j; }
/*      */         while (true) {
/*  240 */           paramInt3--; if (paramInt3 < 0) break;
/*  241 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  242 */           paramInt6 += i5;
/*  243 */           paramInt5 += i3;
/*  244 */           paramInt7 += i8;
/*  245 */           paramInt1 += j;
/*      */         }
/*  247 */         return;
/*      */       }
/*      */ 
/*  251 */       paramInt5 = paramInt4 <<= 16;
/*  252 */       if (paramInt1 < 0) {
/*  253 */         paramInt5 -= i5 * paramInt1;
/*  254 */         paramInt4 -= i4 * paramInt1;
/*  255 */         paramInt7 -= i8 * paramInt1;
/*  256 */         paramInt1 = 0;
/*      */       }
/*  258 */       paramInt6 <<= 16;
/*  259 */       if (paramInt3 < 0) {
/*  260 */         paramInt6 -= i3 * paramInt3;
/*  261 */         paramInt3 = 0;
/*      */       }
/*  263 */       if (((paramInt1 != paramInt3) && (i5 < i4)) || ((paramInt1 == paramInt3) && (i3 > i4))) {
/*  264 */         paramInt2 -= paramInt3;
/*  265 */         paramInt3 -= paramInt1;
/*  266 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  268 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  269 */           paramInt5 += i5;
/*  270 */           paramInt4 += i4;
/*  271 */           paramInt7 += i8;
/*  272 */           paramInt1 += j; }
/*      */         while (true) {
/*  274 */           paramInt2--; if (paramInt2 < 0) break;
/*  275 */           cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  276 */           paramInt6 += i3;
/*  277 */           paramInt4 += i4;
/*  278 */           paramInt7 += i8;
/*  279 */           paramInt1 += j;
/*      */         }
/*  281 */         return;
/*      */       }
/*      */ 
/*  284 */       paramInt2 -= paramInt3;
/*  285 */       paramInt3 -= paramInt1;
/*  286 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  288 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  289 */         paramInt5 += i5;
/*  290 */         paramInt4 += i4;
/*  291 */         paramInt7 += i8;
/*  292 */         paramInt1 += j; }
/*      */       while (true) {
/*  294 */         paramInt2--; if (paramInt2 < 0) break;
/*  295 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  296 */         paramInt6 += i3;
/*  297 */         paramInt4 += i4;
/*  298 */         paramInt7 += i8;
/*  299 */         paramInt1 += j;
/*      */       }
/*  301 */       return;
/*      */     }
/*      */ 
/*  305 */     if (paramInt2 <= paramInt3) {
/*  306 */       if (paramInt2 >= p) return;
/*  307 */       if (paramInt3 > p) paramInt3 = p;
/*  308 */       if (paramInt1 > p) paramInt1 = p;
/*  309 */       paramInt8 = (paramInt8 << 8) - i7 * paramInt5 + i7;
/*  310 */       if (paramInt3 < paramInt1) {
/*  311 */         paramInt4 = paramInt5 <<= 16;
/*  312 */         if (paramInt2 < 0) {
/*  313 */           paramInt4 -= i4 * paramInt2;
/*  314 */           paramInt5 -= i3 * paramInt2;
/*  315 */           paramInt8 -= i8 * paramInt2;
/*  316 */           paramInt2 = 0;
/*      */         }
/*  318 */         paramInt6 <<= 16;
/*  319 */         if (paramInt3 < 0) {
/*  320 */           paramInt6 -= i5 * paramInt3;
/*  321 */           paramInt3 = 0;
/*      */         }
/*  323 */         if (((paramInt2 != paramInt3) && (i4 < i3)) || ((paramInt2 == paramInt3) && (i4 > i5))) {
/*  324 */           paramInt1 -= paramInt3;
/*  325 */           paramInt3 -= paramInt2;
/*  326 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  328 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  329 */             paramInt4 += i4;
/*  330 */             paramInt5 += i3;
/*  331 */             paramInt8 += i8;
/*  332 */             paramInt2 += j; }
/*      */           while (true) {
/*  334 */             paramInt1--; if (paramInt1 < 0) break;
/*  335 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  336 */             paramInt4 += i4;
/*  337 */             paramInt6 += i5;
/*  338 */             paramInt8 += i8;
/*  339 */             paramInt2 += j;
/*      */           }
/*  341 */           return;
/*      */         }
/*      */ 
/*  344 */         paramInt1 -= paramInt3;
/*  345 */         paramInt3 -= paramInt2;
/*  346 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  348 */           cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  349 */           paramInt4 += i4;
/*  350 */           paramInt5 += i3;
/*  351 */           paramInt8 += i8;
/*  352 */           paramInt2 += j; }
/*      */         while (true) {
/*  354 */           paramInt1--; if (paramInt1 < 0) break;
/*  355 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  356 */           paramInt4 += i4;
/*  357 */           paramInt6 += i5;
/*  358 */           paramInt8 += i8;
/*  359 */           paramInt2 += j;
/*      */         }
/*  361 */         return;
/*      */       }
/*      */ 
/*  365 */       paramInt6 = paramInt5 <<= 16;
/*  366 */       if (paramInt2 < 0) {
/*  367 */         paramInt6 -= i4 * paramInt2;
/*  368 */         paramInt5 -= i3 * paramInt2;
/*  369 */         paramInt8 -= i8 * paramInt2;
/*  370 */         paramInt2 = 0;
/*      */       }
/*  372 */       paramInt4 <<= 16;
/*  373 */       if (paramInt1 < 0) {
/*  374 */         paramInt4 -= i5 * paramInt1;
/*  375 */         paramInt1 = 0;
/*      */       }
/*  377 */       if (i4 < i3) {
/*  378 */         paramInt3 -= paramInt1;
/*  379 */         paramInt1 -= paramInt2;
/*  380 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  382 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  383 */           paramInt6 += i4;
/*  384 */           paramInt5 += i3;
/*  385 */           paramInt8 += i8;
/*  386 */           paramInt2 += j; }
/*      */         while (true) {
/*  388 */           paramInt3--; if (paramInt3 < 0) break;
/*  389 */           cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  390 */           paramInt4 += i5;
/*  391 */           paramInt5 += i3;
/*  392 */           paramInt8 += i8;
/*  393 */           paramInt2 += j;
/*      */         }
/*  395 */         return;
/*      */       }
/*      */ 
/*  398 */       paramInt3 -= paramInt1;
/*  399 */       paramInt1 -= paramInt2;
/*  400 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  402 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  403 */         paramInt6 += i4;
/*  404 */         paramInt5 += i3;
/*  405 */         paramInt8 += i8;
/*  406 */         paramInt2 += j; }
/*      */       while (true) {
/*  408 */         paramInt3--; if (paramInt3 < 0) break;
/*  409 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  410 */         paramInt4 += i5;
/*  411 */         paramInt5 += i3;
/*  412 */         paramInt8 += i8;
/*  413 */         paramInt2 += j;
/*      */       }
/*  415 */       return;
/*      */     }
/*      */ 
/*  420 */     if (paramInt3 >= p) return;
/*  421 */     if (paramInt1 > p) paramInt1 = p;
/*  422 */     if (paramInt2 > p) paramInt2 = p;
/*  423 */     paramInt9 = (paramInt9 << 8) - i7 * paramInt6 + i7;
/*  424 */     if (paramInt1 < paramInt2) {
/*  425 */       paramInt5 = paramInt6 <<= 16;
/*  426 */       if (paramInt3 < 0) {
/*  427 */         paramInt5 -= i3 * paramInt3;
/*  428 */         paramInt6 -= i5 * paramInt3;
/*  429 */         paramInt9 -= i8 * paramInt3;
/*  430 */         paramInt3 = 0;
/*      */       }
/*  432 */       paramInt4 <<= 16;
/*  433 */       if (paramInt1 < 0) {
/*  434 */         paramInt4 -= i4 * paramInt1;
/*  435 */         paramInt1 = 0;
/*      */       }
/*  437 */       if (i3 < i5) {
/*  438 */         paramInt2 -= paramInt1;
/*  439 */         paramInt1 -= paramInt3;
/*  440 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  442 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  443 */           paramInt5 += i3;
/*  444 */           paramInt6 += i5;
/*  445 */           paramInt9 += i8;
/*  446 */           paramInt3 += j; }
/*      */         while (true) {
/*  448 */           paramInt2--; if (paramInt2 < 0) break;
/*  449 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  450 */           paramInt5 += i3;
/*  451 */           paramInt4 += i4;
/*  452 */           paramInt9 += i8;
/*  453 */           paramInt3 += j;
/*      */         }
/*  455 */         return;
/*      */       }
/*      */ 
/*  458 */       paramInt2 -= paramInt1;
/*  459 */       paramInt1 -= paramInt3;
/*  460 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  462 */         cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  463 */         paramInt5 += i3;
/*  464 */         paramInt6 += i5;
/*  465 */         paramInt9 += i8;
/*  466 */         paramInt3 += j; }
/*      */       while (true) {
/*  468 */         paramInt2--; if (paramInt2 < 0) break;
/*  469 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  470 */         paramInt5 += i3;
/*  471 */         paramInt4 += i4;
/*  472 */         paramInt9 += i8;
/*  473 */         paramInt3 += j;
/*      */       }
/*  475 */       return;
/*      */     }
/*      */ 
/*  479 */     paramInt4 = paramInt6 <<= 16;
/*  480 */     if (paramInt3 < 0) {
/*  481 */       paramInt4 -= i3 * paramInt3;
/*  482 */       paramInt6 -= i5 * paramInt3;
/*  483 */       paramInt9 -= i8 * paramInt3;
/*  484 */       paramInt3 = 0;
/*      */     }
/*  486 */     paramInt5 <<= 16;
/*  487 */     if (paramInt2 < 0) {
/*  488 */       paramInt5 -= i4 * paramInt2;
/*  489 */       paramInt2 = 0;
/*      */     }
/*  491 */     if (i3 < i5) {
/*  492 */       paramInt1 -= paramInt2;
/*  493 */       paramInt2 -= paramInt3;
/*  494 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  496 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  497 */         paramInt4 += i3;
/*  498 */         paramInt6 += i5;
/*  499 */         paramInt9 += i8;
/*  500 */         paramInt3 += j; }
/*      */       while (true) {
/*  502 */         paramInt1--; if (paramInt1 < 0) break;
/*  503 */         cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  504 */         paramInt5 += i4;
/*  505 */         paramInt6 += i5;
/*  506 */         paramInt9 += i8;
/*  507 */         paramInt3 += j;
/*      */       }
/*  509 */       return;
/*      */     }
/*      */ 
/*  512 */     paramInt1 -= paramInt2;
/*  513 */     paramInt2 -= paramInt3;
/*  514 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  516 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  517 */       paramInt4 += i3;
/*  518 */       paramInt6 += i5;
/*  519 */       paramInt9 += i8;
/*  520 */       paramInt3 += j; }
/*      */     while (true) {
/*  522 */       paramInt1--; if (paramInt1 < 0) break;
/*  523 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  524 */       paramInt5 += i4;
/*  525 */       paramInt6 += i5;
/*  526 */       paramInt9 += i8;
/*  527 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void da(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*      */   {
/*  172 */     int i = paramInt5 - paramInt4;
/*  173 */     int j = paramInt2 - paramInt1;
/*  174 */     int m = paramInt6 - paramInt4;
/*  175 */     int n = paramInt3 - paramInt1;
/*  176 */     int i1 = paramInt8 - paramInt7;
/*  177 */     int i2 = paramInt9 - paramInt7;
/*      */     int i3;
/*  179 */     if (paramInt3 != paramInt2) i3 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2); else
/*  180 */       i3 = 0;
/*  182 */     int i4;
/*  182 */     if (paramInt2 != paramInt1) i4 = (i << 16) / j; else
/*  183 */       i4 = 0;
/*  185 */     int i5;
/*  185 */     if (paramInt3 != paramInt1) i5 = (m << 16) / n; else
/*  186 */       i5 = 0;
/*  187 */     int i6 = i * n - m * j;
/*  188 */     if (i6 == 0) return;
/*  189 */     int i7 = (i1 * n - i2 * j << 8) / i6;
/*  190 */     int i8 = (i2 * i - i1 * m << 8) / i6;
/*  191 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  192 */       if (paramInt1 >= p) return;
/*  193 */       if (paramInt2 > p) paramInt2 = p;
/*  194 */       if (paramInt3 > p) paramInt3 = p;
/*  195 */       paramInt7 = (paramInt7 << 8) - i7 * paramInt4 + i7;
/*  196 */       if (paramInt2 < paramInt3) {
/*  197 */         paramInt6 = paramInt4 <<= 16;
/*  198 */         if (paramInt1 < 0) {
/*  199 */           paramInt6 -= i5 * paramInt1;
/*  200 */           paramInt4 -= i4 * paramInt1;
/*  201 */           paramInt7 -= i8 * paramInt1;
/*  202 */           paramInt1 = 0;
/*      */         }
/*  204 */         paramInt5 <<= 16;
/*  205 */         if (paramInt2 < 0) {
/*  206 */           paramInt5 -= i3 * paramInt2;
/*  207 */           paramInt2 = 0;
/*      */         }
/*  209 */         if (((paramInt1 != paramInt2) && (i5 < i4)) || ((paramInt1 == paramInt2) && (i5 > i3))) {
/*  210 */           paramInt3 -= paramInt2;
/*  211 */           paramInt2 -= paramInt1;
/*  212 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  214 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  215 */             paramInt6 += i5;
/*  216 */             paramInt4 += i4;
/*  217 */             paramInt7 += i8;
/*  218 */             paramInt1 += j; }
/*      */           while (true) {
/*  220 */             paramInt3--; if (paramInt3 < 0) break;
/*  221 */             cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  222 */             paramInt6 += i5;
/*  223 */             paramInt5 += i3;
/*  224 */             paramInt7 += i8;
/*  225 */             paramInt1 += j;
/*      */           }
/*  227 */           return;
/*      */         }
/*      */ 
/*  230 */         paramInt3 -= paramInt2;
/*  231 */         paramInt2 -= paramInt1;
/*  232 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  234 */           cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  235 */           paramInt6 += i5;
/*  236 */           paramInt4 += i4;
/*  237 */           paramInt7 += i8;
/*  238 */           paramInt1 += j; }
/*      */         while (true) {
/*  240 */           paramInt3--; if (paramInt3 < 0) break;
/*  241 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  242 */           paramInt6 += i5;
/*  243 */           paramInt5 += i3;
/*  244 */           paramInt7 += i8;
/*  245 */           paramInt1 += j;
/*      */         }
/*  247 */         return;
/*      */       }
/*      */ 
/*  251 */       paramInt5 = paramInt4 <<= 16;
/*  252 */       if (paramInt1 < 0) {
/*  253 */         paramInt5 -= i5 * paramInt1;
/*  254 */         paramInt4 -= i4 * paramInt1;
/*  255 */         paramInt7 -= i8 * paramInt1;
/*  256 */         paramInt1 = 0;
/*      */       }
/*  258 */       paramInt6 <<= 16;
/*  259 */       if (paramInt3 < 0) {
/*  260 */         paramInt6 -= i3 * paramInt3;
/*  261 */         paramInt3 = 0;
/*      */       }
/*  263 */       if (((paramInt1 != paramInt3) && (i5 < i4)) || ((paramInt1 == paramInt3) && (i3 > i4))) {
/*  264 */         paramInt2 -= paramInt3;
/*  265 */         paramInt3 -= paramInt1;
/*  266 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  268 */           cs(n, paramInt1, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  269 */           paramInt5 += i5;
/*  270 */           paramInt4 += i4;
/*  271 */           paramInt7 += i8;
/*  272 */           paramInt1 += j; }
/*      */         while (true) {
/*  274 */           paramInt2--; if (paramInt2 < 0) break;
/*  275 */           cs(n, paramInt1, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7);
/*  276 */           paramInt6 += i3;
/*  277 */           paramInt4 += i4;
/*  278 */           paramInt7 += i8;
/*  279 */           paramInt1 += j;
/*      */         }
/*  281 */         return;
/*      */       }
/*      */ 
/*  284 */       paramInt2 -= paramInt3;
/*  285 */       paramInt3 -= paramInt1;
/*  286 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  288 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7);
/*  289 */         paramInt5 += i5;
/*  290 */         paramInt4 += i4;
/*  291 */         paramInt7 += i8;
/*  292 */         paramInt1 += j; }
/*      */       while (true) {
/*  294 */         paramInt2--; if (paramInt2 < 0) break;
/*  295 */         cs(n, paramInt1, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7);
/*  296 */         paramInt6 += i3;
/*  297 */         paramInt4 += i4;
/*  298 */         paramInt7 += i8;
/*  299 */         paramInt1 += j;
/*      */       }
/*  301 */       return;
/*      */     }
/*      */ 
/*  305 */     if (paramInt2 <= paramInt3) {
/*  306 */       if (paramInt2 >= p) return;
/*  307 */       if (paramInt3 > p) paramInt3 = p;
/*  308 */       if (paramInt1 > p) paramInt1 = p;
/*  309 */       paramInt8 = (paramInt8 << 8) - i7 * paramInt5 + i7;
/*  310 */       if (paramInt3 < paramInt1) {
/*  311 */         paramInt4 = paramInt5 <<= 16;
/*  312 */         if (paramInt2 < 0) {
/*  313 */           paramInt4 -= i4 * paramInt2;
/*  314 */           paramInt5 -= i3 * paramInt2;
/*  315 */           paramInt8 -= i8 * paramInt2;
/*  316 */           paramInt2 = 0;
/*      */         }
/*  318 */         paramInt6 <<= 16;
/*  319 */         if (paramInt3 < 0) {
/*  320 */           paramInt6 -= i5 * paramInt3;
/*  321 */           paramInt3 = 0;
/*      */         }
/*  323 */         if (((paramInt2 != paramInt3) && (i4 < i3)) || ((paramInt2 == paramInt3) && (i4 > i5))) {
/*  324 */           paramInt1 -= paramInt3;
/*  325 */           paramInt3 -= paramInt2;
/*  326 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  328 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  329 */             paramInt4 += i4;
/*  330 */             paramInt5 += i3;
/*  331 */             paramInt8 += i8;
/*  332 */             paramInt2 += j; }
/*      */           while (true) {
/*  334 */             paramInt1--; if (paramInt1 < 0) break;
/*  335 */             cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  336 */             paramInt4 += i4;
/*  337 */             paramInt6 += i5;
/*  338 */             paramInt8 += i8;
/*  339 */             paramInt2 += j;
/*      */           }
/*  341 */           return;
/*      */         }
/*      */ 
/*  344 */         paramInt1 -= paramInt3;
/*  345 */         paramInt3 -= paramInt2;
/*  346 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  348 */           cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  349 */           paramInt4 += i4;
/*  350 */           paramInt5 += i3;
/*  351 */           paramInt8 += i8;
/*  352 */           paramInt2 += j; }
/*      */         while (true) {
/*  354 */           paramInt1--; if (paramInt1 < 0) break;
/*  355 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  356 */           paramInt4 += i4;
/*  357 */           paramInt6 += i5;
/*  358 */           paramInt8 += i8;
/*  359 */           paramInt2 += j;
/*      */         }
/*  361 */         return;
/*      */       }
/*      */ 
/*  365 */       paramInt6 = paramInt5 <<= 16;
/*  366 */       if (paramInt2 < 0) {
/*  367 */         paramInt6 -= i4 * paramInt2;
/*  368 */         paramInt5 -= i3 * paramInt2;
/*  369 */         paramInt8 -= i8 * paramInt2;
/*  370 */         paramInt2 = 0;
/*      */       }
/*  372 */       paramInt4 <<= 16;
/*  373 */       if (paramInt1 < 0) {
/*  374 */         paramInt4 -= i5 * paramInt1;
/*  375 */         paramInt1 = 0;
/*      */       }
/*  377 */       if (i4 < i3) {
/*  378 */         paramInt3 -= paramInt1;
/*  379 */         paramInt1 -= paramInt2;
/*  380 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  382 */           cs(n, paramInt2, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  383 */           paramInt6 += i4;
/*  384 */           paramInt5 += i3;
/*  385 */           paramInt8 += i8;
/*  386 */           paramInt2 += j; }
/*      */         while (true) {
/*  388 */           paramInt3--; if (paramInt3 < 0) break;
/*  389 */           cs(n, paramInt2, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7);
/*  390 */           paramInt4 += i5;
/*  391 */           paramInt5 += i3;
/*  392 */           paramInt8 += i8;
/*  393 */           paramInt2 += j;
/*      */         }
/*  395 */         return;
/*      */       }
/*      */ 
/*  398 */       paramInt3 -= paramInt1;
/*  399 */       paramInt1 -= paramInt2;
/*  400 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  402 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7);
/*  403 */         paramInt6 += i4;
/*  404 */         paramInt5 += i3;
/*  405 */         paramInt8 += i8;
/*  406 */         paramInt2 += j; }
/*      */       while (true) {
/*  408 */         paramInt3--; if (paramInt3 < 0) break;
/*  409 */         cs(n, paramInt2, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7);
/*  410 */         paramInt4 += i5;
/*  411 */         paramInt5 += i3;
/*  412 */         paramInt8 += i8;
/*  413 */         paramInt2 += j;
/*      */       }
/*  415 */       return;
/*      */     }
/*      */ 
/*  420 */     if (paramInt3 >= p) return;
/*  421 */     if (paramInt1 > p) paramInt1 = p;
/*  422 */     if (paramInt2 > p) paramInt2 = p;
/*  423 */     paramInt9 = (paramInt9 << 8) - i7 * paramInt6 + i7;
/*  424 */     if (paramInt1 < paramInt2) {
/*  425 */       paramInt5 = paramInt6 <<= 16;
/*  426 */       if (paramInt3 < 0) {
/*  427 */         paramInt5 -= i3 * paramInt3;
/*  428 */         paramInt6 -= i5 * paramInt3;
/*  429 */         paramInt9 -= i8 * paramInt3;
/*  430 */         paramInt3 = 0;
/*      */       }
/*  432 */       paramInt4 <<= 16;
/*  433 */       if (paramInt1 < 0) {
/*  434 */         paramInt4 -= i4 * paramInt1;
/*  435 */         paramInt1 = 0;
/*      */       }
/*  437 */       if (i3 < i5) {
/*  438 */         paramInt2 -= paramInt1;
/*  439 */         paramInt1 -= paramInt3;
/*  440 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  442 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  443 */           paramInt5 += i3;
/*  444 */           paramInt6 += i5;
/*  445 */           paramInt9 += i8;
/*  446 */           paramInt3 += j; }
/*      */         while (true) {
/*  448 */           paramInt2--; if (paramInt2 < 0) break;
/*  449 */           cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  450 */           paramInt5 += i3;
/*  451 */           paramInt4 += i4;
/*  452 */           paramInt9 += i8;
/*  453 */           paramInt3 += j;
/*      */         }
/*  455 */         return;
/*      */       }
/*      */ 
/*  458 */       paramInt2 -= paramInt1;
/*  459 */       paramInt1 -= paramInt3;
/*  460 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  462 */         cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  463 */         paramInt5 += i3;
/*  464 */         paramInt6 += i5;
/*  465 */         paramInt9 += i8;
/*  466 */         paramInt3 += j; }
/*      */       while (true) {
/*  468 */         paramInt2--; if (paramInt2 < 0) break;
/*  469 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  470 */         paramInt5 += i3;
/*  471 */         paramInt4 += i4;
/*  472 */         paramInt9 += i8;
/*  473 */         paramInt3 += j;
/*      */       }
/*  475 */       return;
/*      */     }
/*      */ 
/*  479 */     paramInt4 = paramInt6 <<= 16;
/*  480 */     if (paramInt3 < 0) {
/*  481 */       paramInt4 -= i3 * paramInt3;
/*  482 */       paramInt6 -= i5 * paramInt3;
/*  483 */       paramInt9 -= i8 * paramInt3;
/*  484 */       paramInt3 = 0;
/*      */     }
/*  486 */     paramInt5 <<= 16;
/*  487 */     if (paramInt2 < 0) {
/*  488 */       paramInt5 -= i4 * paramInt2;
/*  489 */       paramInt2 = 0;
/*      */     }
/*  491 */     if (i3 < i5) {
/*  492 */       paramInt1 -= paramInt2;
/*  493 */       paramInt2 -= paramInt3;
/*  494 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  496 */         cs(n, paramInt3, 0, 0, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  497 */         paramInt4 += i3;
/*  498 */         paramInt6 += i5;
/*  499 */         paramInt9 += i8;
/*  500 */         paramInt3 += j; }
/*      */       while (true) {
/*  502 */         paramInt1--; if (paramInt1 < 0) break;
/*  503 */         cs(n, paramInt3, 0, 0, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7);
/*  504 */         paramInt5 += i4;
/*  505 */         paramInt6 += i5;
/*  506 */         paramInt9 += i8;
/*  507 */         paramInt3 += j;
/*      */       }
/*  509 */       return;
/*      */     }
/*      */ 
/*  512 */     paramInt1 -= paramInt2;
/*  513 */     paramInt2 -= paramInt3;
/*  514 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  516 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7);
/*  517 */       paramInt4 += i3;
/*  518 */       paramInt6 += i5;
/*  519 */       paramInt9 += i8;
/*  520 */       paramInt3 += j; }
/*      */     while (true) {
/*  522 */       paramInt1--; if (paramInt1 < 0) break;
/*  523 */       cs(n, paramInt3, 0, 0, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7);
/*  524 */       paramInt5 += i4;
/*  525 */       paramInt6 += i5;
/*  526 */       paramInt9 += i8;
/*  527 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void ce(double paramDouble)
/*      */   {
/*  106 */     br(paramDouble, 0, 512);
/*      */   }
/*      */ 
/*      */   static final void dv(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  536 */     if (u) {
/*  537 */       if (paramInt5 > x) paramInt5 = x;
/*  538 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  540 */     if (paramInt4 >= paramInt5) return;
/*  541 */     paramInt1 += paramInt4;
/*  542 */     paramInt6 += paramInt7 * paramInt4;
/*      */     int i;
/*      */     int j;
/*      */     int m;
/*  543 */     if (e) {
/*  544 */       paramInt3 = paramInt5 - paramInt4 >> 2;
/*  545 */       paramInt7 <<= 2;
/*  546 */       if (b == 0) {
/*  547 */         if (paramInt3 > 0) {
/*      */           do {
/*  549 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  550 */             paramInt6 += paramInt7;
/*  551 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  552 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  553 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  554 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  555 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  557 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  558 */         if (paramInt3 > 0) {
/*  559 */           paramInt2 = ap[(paramInt6 >> 8)];
/*      */           do {
/*  561 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  562 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*      */       else {
/*  566 */         i = b;
/*  567 */         j = 256 - b;
/*  568 */         if (paramInt3 > 0) {
/*      */           do {
/*  570 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  571 */             paramInt6 += paramInt7;
/*  572 */             paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  573 */             m = paramArrayOfInt[paramInt1];
/*  574 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  575 */             m = paramArrayOfInt[paramInt1];
/*  576 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  577 */             m = paramArrayOfInt[paramInt1];
/*  578 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  579 */             m = paramArrayOfInt[paramInt1];
/*  580 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  581 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  583 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  584 */         if (paramInt3 > 0) {
/*  585 */           paramInt2 = ap[(paramInt6 >> 8)];
/*  586 */           paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */           do {
/*  588 */             m = paramArrayOfInt[paramInt1];
/*  589 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  590 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*  593 */       return;
/*      */     }
/*      */ 
/*  596 */     paramInt3 = paramInt5 - paramInt4;
/*  597 */     if (b == 0) {
/*      */       do {
/*  599 */         paramArrayOfInt[(paramInt1++)] = ap[(paramInt6 >> 8)];
/*  600 */         paramInt6 += paramInt7;
/*  601 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */     else {
/*  604 */       i = b;
/*  605 */       j = 256 - b;
/*      */       do {
/*  607 */         paramInt2 = ap[(paramInt6 >> 8)];
/*  608 */         paramInt6 += paramInt7;
/*  609 */         paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  610 */         m = paramArrayOfInt[paramInt1];
/*  611 */         paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  612 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void ds(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  536 */     if (u) {
/*  537 */       if (paramInt5 > x) paramInt5 = x;
/*  538 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  540 */     if (paramInt4 >= paramInt5) return;
/*  541 */     paramInt1 += paramInt4;
/*  542 */     paramInt6 += paramInt7 * paramInt4;
/*      */     int i;
/*      */     int j;
/*      */     int m;
/*  543 */     if (e) {
/*  544 */       paramInt3 = paramInt5 - paramInt4 >> 2;
/*  545 */       paramInt7 <<= 2;
/*  546 */       if (b == 0) {
/*  547 */         if (paramInt3 > 0) {
/*      */           do {
/*  549 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  550 */             paramInt6 += paramInt7;
/*  551 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  552 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  553 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  554 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  555 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  557 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  558 */         if (paramInt3 > 0) {
/*  559 */           paramInt2 = ap[(paramInt6 >> 8)];
/*      */           do {
/*  561 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  562 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*      */       else {
/*  566 */         i = b;
/*  567 */         j = 256 - b;
/*  568 */         if (paramInt3 > 0) {
/*      */           do {
/*  570 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  571 */             paramInt6 += paramInt7;
/*  572 */             paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  573 */             m = paramArrayOfInt[paramInt1];
/*  574 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  575 */             m = paramArrayOfInt[paramInt1];
/*  576 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  577 */             m = paramArrayOfInt[paramInt1];
/*  578 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  579 */             m = paramArrayOfInt[paramInt1];
/*  580 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  581 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  583 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  584 */         if (paramInt3 > 0) {
/*  585 */           paramInt2 = ap[(paramInt6 >> 8)];
/*  586 */           paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */           do {
/*  588 */             m = paramArrayOfInt[paramInt1];
/*  589 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  590 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*  593 */       return;
/*      */     }
/*      */ 
/*  596 */     paramInt3 = paramInt5 - paramInt4;
/*  597 */     if (b == 0) {
/*      */       do {
/*  599 */         paramArrayOfInt[(paramInt1++)] = ap[(paramInt6 >> 8)];
/*  600 */         paramInt6 += paramInt7;
/*  601 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */     else {
/*  604 */       i = b;
/*  605 */       j = 256 - b;
/*      */       do {
/*  607 */         paramInt2 = ap[(paramInt6 >> 8)];
/*  608 */         paramInt6 += paramInt7;
/*  609 */         paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  610 */         m = paramArrayOfInt[paramInt1];
/*  611 */         paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  612 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dh(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  536 */     if (u) {
/*  537 */       if (paramInt5 > x) paramInt5 = x;
/*  538 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  540 */     if (paramInt4 >= paramInt5) return;
/*  541 */     paramInt1 += paramInt4;
/*  542 */     paramInt6 += paramInt7 * paramInt4;
/*      */     int i;
/*      */     int j;
/*      */     int m;
/*  543 */     if (e) {
/*  544 */       paramInt3 = paramInt5 - paramInt4 >> 2;
/*  545 */       paramInt7 <<= 2;
/*  546 */       if (b == 0) {
/*  547 */         if (paramInt3 > 0) {
/*      */           do {
/*  549 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  550 */             paramInt6 += paramInt7;
/*  551 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  552 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  553 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  554 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  555 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  557 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  558 */         if (paramInt3 > 0) {
/*  559 */           paramInt2 = ap[(paramInt6 >> 8)];
/*      */           do {
/*  561 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  562 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*      */       else {
/*  566 */         i = b;
/*  567 */         j = 256 - b;
/*  568 */         if (paramInt3 > 0) {
/*      */           do {
/*  570 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  571 */             paramInt6 += paramInt7;
/*  572 */             paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  573 */             m = paramArrayOfInt[paramInt1];
/*  574 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  575 */             m = paramArrayOfInt[paramInt1];
/*  576 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  577 */             m = paramArrayOfInt[paramInt1];
/*  578 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  579 */             m = paramArrayOfInt[paramInt1];
/*  580 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  581 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  583 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  584 */         if (paramInt3 > 0) {
/*  585 */           paramInt2 = ap[(paramInt6 >> 8)];
/*  586 */           paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */           do {
/*  588 */             m = paramArrayOfInt[paramInt1];
/*  589 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  590 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*  593 */       return;
/*      */     }
/*      */ 
/*  596 */     paramInt3 = paramInt5 - paramInt4;
/*  597 */     if (b == 0) {
/*      */       do {
/*  599 */         paramArrayOfInt[(paramInt1++)] = ap[(paramInt6 >> 8)];
/*  600 */         paramInt6 += paramInt7;
/*  601 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */     else {
/*  604 */       i = b;
/*  605 */       j = 256 - b;
/*      */       do {
/*  607 */         paramInt2 = ap[(paramInt6 >> 8)];
/*  608 */         paramInt6 += paramInt7;
/*  609 */         paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  610 */         m = paramArrayOfInt[paramInt1];
/*  611 */         paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  612 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void du(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19)
/*      */   {
/* 1834 */     int[] arrayOfInt = av.r(paramInt19, -112476939);
/* 1835 */     if (arrayOfInt == null) {
/* 1836 */       i = av.d(paramInt19, -2118988549);
/* 1837 */       cr(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, cu(i, paramInt7), cu(i, paramInt8), cu(i, paramInt9));
/* 1838 */       return;
/*      */     }
/* 1840 */     w = av.m(paramInt19, 2006578786);
/* 1841 */     v = av.l(paramInt19, -391651346);
/* 1842 */     int i = paramInt5 - paramInt4;
/* 1843 */     int j = paramInt2 - paramInt1;
/* 1844 */     int m = paramInt6 - paramInt4;
/* 1845 */     int n = paramInt3 - paramInt1;
/* 1846 */     int i1 = paramInt8 - paramInt7;
/* 1847 */     int i2 = paramInt9 - paramInt7;
/* 1848 */     int i3 = 0;
/* 1849 */     if (paramInt2 != paramInt1) i3 = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/* 1850 */     int i4 = 0;
/* 1851 */     if (paramInt3 != paramInt2) i4 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/* 1852 */     int i5 = 0;
/* 1853 */     if (paramInt3 != paramInt1) i5 = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/* 1854 */     int i6 = i * n - m * j;
/* 1855 */     if (i6 == 0) return;
/* 1856 */     int i7 = (i1 * n - i2 * j << 9) / i6;
/* 1857 */     int i8 = (i2 * i - i1 * m << 9) / i6;
/* 1858 */     paramInt11 = paramInt10 - paramInt11;
/* 1859 */     paramInt14 = paramInt13 - paramInt14;
/* 1860 */     paramInt17 = paramInt16 - paramInt17;
/* 1861 */     paramInt12 -= paramInt10;
/* 1862 */     paramInt15 -= paramInt13;
/* 1863 */     paramInt18 -= paramInt16;
/* 1864 */     int i9 = paramInt12 * paramInt13 - paramInt15 * paramInt10 << 14;
/* 1865 */     int i10 = paramInt15 * paramInt16 - paramInt18 * paramInt13 << 5;
/* 1866 */     int i11 = paramInt18 * paramInt10 - paramInt12 * paramInt16 << 5;
/* 1867 */     int i12 = paramInt11 * paramInt13 - paramInt14 * paramInt10 << 14;
/* 1868 */     int i13 = paramInt14 * paramInt16 - paramInt17 * paramInt13 << 5;
/* 1869 */     int i14 = paramInt17 * paramInt10 - paramInt11 * paramInt16 << 5;
/* 1870 */     int i15 = paramInt14 * paramInt12 - paramInt11 * paramInt15 << 14;
/* 1871 */     int i16 = paramInt17 * paramInt15 - paramInt14 * paramInt18 << 5;
/* 1872 */     int i17 = paramInt11 * paramInt18 - paramInt17 * paramInt12 << 5;
/* 1873 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/* 1874 */       if (paramInt1 >= p) return;
/* 1875 */       if (paramInt2 > p) paramInt2 = p;
/* 1876 */       if (paramInt3 > p) paramInt3 = p;
/* 1877 */       paramInt7 = (paramInt7 << 9) - i7 * paramInt4 + i7;
/* 1878 */       if (paramInt2 < paramInt3) {
/* 1879 */         paramInt6 = paramInt4 <<= 16;
/* 1880 */         if (paramInt1 < 0) {
/* 1881 */           paramInt6 -= i5 * paramInt1;
/* 1882 */           paramInt4 -= i3 * paramInt1;
/* 1883 */           paramInt7 -= i8 * paramInt1;
/* 1884 */           paramInt1 = 0;
/*      */         }
/* 1886 */         paramInt5 <<= 16;
/* 1887 */         if (paramInt2 < 0) {
/* 1888 */           paramInt5 -= i4 * paramInt2;
/* 1889 */           paramInt2 = 0;
/*      */         }
/* 1891 */         i18 = paramInt1 - h;
/* 1892 */         i9 += i11 * i18;
/* 1893 */         i12 += i14 * i18;
/* 1894 */         i15 += i17 * i18;
/* 1895 */         if (((paramInt1 != paramInt2) && (i5 < i3)) || ((paramInt1 == paramInt2) && (i5 > i4))) {
/* 1896 */           paramInt3 -= paramInt2;
/* 1897 */           paramInt2 -= paramInt1;
/* 1898 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1900 */             ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1901 */             paramInt6 += i5;
/* 1902 */             paramInt4 += i3;
/* 1903 */             paramInt7 += i8;
/* 1904 */             paramInt1 += j;
/* 1905 */             i9 += i11;
/* 1906 */             i12 += i14;
/* 1907 */             i15 += i17; }
/*      */           while (true) {
/* 1909 */             paramInt3--; if (paramInt3 < 0) break;
/* 1910 */             ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1911 */             paramInt6 += i5;
/* 1912 */             paramInt5 += i4;
/* 1913 */             paramInt7 += i8;
/* 1914 */             paramInt1 += j;
/* 1915 */             i9 += i11;
/* 1916 */             i12 += i14;
/* 1917 */             i15 += i17;
/*      */           }
/* 1919 */           return;
/*      */         }
/*      */ 
/* 1922 */         paramInt3 -= paramInt2;
/* 1923 */         paramInt2 -= paramInt1;
/* 1924 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1926 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1927 */           paramInt6 += i5;
/* 1928 */           paramInt4 += i3;
/* 1929 */           paramInt7 += i8;
/* 1930 */           paramInt1 += j;
/* 1931 */           i9 += i11;
/* 1932 */           i12 += i14;
/* 1933 */           i15 += i17; }
/*      */         while (true) {
/* 1935 */           paramInt3--; if (paramInt3 < 0) break;
/* 1936 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1937 */           paramInt6 += i5;
/* 1938 */           paramInt5 += i4;
/* 1939 */           paramInt7 += i8;
/* 1940 */           paramInt1 += j;
/* 1941 */           i9 += i11;
/* 1942 */           i12 += i14;
/* 1943 */           i15 += i17;
/*      */         }
/* 1945 */         return;
/*      */       }
/*      */ 
/* 1949 */       paramInt5 = paramInt4 <<= 16;
/* 1950 */       if (paramInt1 < 0) {
/* 1951 */         paramInt5 -= i5 * paramInt1;
/* 1952 */         paramInt4 -= i3 * paramInt1;
/* 1953 */         paramInt7 -= i8 * paramInt1;
/* 1954 */         paramInt1 = 0;
/*      */       }
/* 1956 */       paramInt6 <<= 16;
/* 1957 */       if (paramInt3 < 0) {
/* 1958 */         paramInt6 -= i4 * paramInt3;
/* 1959 */         paramInt3 = 0;
/*      */       }
/* 1961 */       i18 = paramInt1 - h;
/* 1962 */       i9 += i11 * i18;
/* 1963 */       i12 += i14 * i18;
/* 1964 */       i15 += i17 * i18;
/* 1965 */       if (((paramInt1 != paramInt3) && (i5 < i3)) || ((paramInt1 == paramInt3) && (i4 > i3))) {
/* 1966 */         paramInt2 -= paramInt3;
/* 1967 */         paramInt3 -= paramInt1;
/* 1968 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1970 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1971 */           paramInt5 += i5;
/* 1972 */           paramInt4 += i3;
/* 1973 */           paramInt7 += i8;
/* 1974 */           paramInt1 += j;
/* 1975 */           i9 += i11;
/* 1976 */           i12 += i14;
/* 1977 */           i15 += i17; }
/*      */         while (true) {
/* 1979 */           paramInt2--; if (paramInt2 < 0) break;
/* 1980 */           ch(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1981 */           paramInt6 += i4;
/* 1982 */           paramInt4 += i3;
/* 1983 */           paramInt7 += i8;
/* 1984 */           paramInt1 += j;
/* 1985 */           i9 += i11;
/* 1986 */           i12 += i14;
/* 1987 */           i15 += i17;
/*      */         }
/* 1989 */         return;
/*      */       }
/*      */ 
/* 1992 */       paramInt2 -= paramInt3;
/* 1993 */       paramInt3 -= paramInt1;
/* 1994 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1996 */         ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1997 */         paramInt5 += i5;
/* 1998 */         paramInt4 += i3;
/* 1999 */         paramInt7 += i8;
/* 2000 */         paramInt1 += j;
/* 2001 */         i9 += i11;
/* 2002 */         i12 += i14;
/* 2003 */         i15 += i17; }
/*      */       while (true) {
/* 2005 */         paramInt2--; if (paramInt2 < 0) break;
/* 2006 */         ch(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 2007 */         paramInt6 += i4;
/* 2008 */         paramInt4 += i3;
/* 2009 */         paramInt7 += i8;
/* 2010 */         paramInt1 += j;
/* 2011 */         i9 += i11;
/* 2012 */         i12 += i14;
/* 2013 */         i15 += i17;
/*      */       }
/* 2015 */       return;
/*      */     }
/*      */ 
/* 2019 */     if (paramInt2 <= paramInt3) {
/* 2020 */       if (paramInt2 >= p) return;
/* 2021 */       if (paramInt3 > p) paramInt3 = p;
/* 2022 */       if (paramInt1 > p) paramInt1 = p;
/* 2023 */       paramInt8 = (paramInt8 << 9) - i7 * paramInt5 + i7;
/* 2024 */       if (paramInt3 < paramInt1) {
/* 2025 */         paramInt4 = paramInt5 <<= 16;
/* 2026 */         if (paramInt2 < 0) {
/* 2027 */           paramInt4 -= i3 * paramInt2;
/* 2028 */           paramInt5 -= i4 * paramInt2;
/* 2029 */           paramInt8 -= i8 * paramInt2;
/* 2030 */           paramInt2 = 0;
/*      */         }
/* 2032 */         paramInt6 <<= 16;
/* 2033 */         if (paramInt3 < 0) {
/* 2034 */           paramInt6 -= i5 * paramInt3;
/* 2035 */           paramInt3 = 0;
/*      */         }
/* 2037 */         i18 = paramInt2 - h;
/* 2038 */         i9 += i11 * i18;
/* 2039 */         i12 += i14 * i18;
/* 2040 */         i15 += i17 * i18;
/* 2041 */         if (((paramInt2 != paramInt3) && (i3 < i4)) || ((paramInt2 == paramInt3) && (i3 > i5))) {
/* 2042 */           paramInt1 -= paramInt3;
/* 2043 */           paramInt3 -= paramInt2;
/* 2044 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 2046 */             ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2047 */             paramInt4 += i3;
/* 2048 */             paramInt5 += i4;
/* 2049 */             paramInt8 += i8;
/* 2050 */             paramInt2 += j;
/* 2051 */             i9 += i11;
/* 2052 */             i12 += i14;
/* 2053 */             i15 += i17; }
/*      */           while (true) {
/* 2055 */             paramInt1--; if (paramInt1 < 0) break;
/* 2056 */             ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2057 */             paramInt4 += i3;
/* 2058 */             paramInt6 += i5;
/* 2059 */             paramInt8 += i8;
/* 2060 */             paramInt2 += j;
/* 2061 */             i9 += i11;
/* 2062 */             i12 += i14;
/* 2063 */             i15 += i17;
/*      */           }
/* 2065 */           return;
/*      */         }
/*      */ 
/* 2068 */         paramInt1 -= paramInt3;
/* 2069 */         paramInt3 -= paramInt2;
/* 2070 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 2072 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2073 */           paramInt4 += i3;
/* 2074 */           paramInt5 += i4;
/* 2075 */           paramInt8 += i8;
/* 2076 */           paramInt2 += j;
/* 2077 */           i9 += i11;
/* 2078 */           i12 += i14;
/* 2079 */           i15 += i17; }
/*      */         while (true) {
/* 2081 */           paramInt1--; if (paramInt1 < 0) break;
/* 2082 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2083 */           paramInt4 += i3;
/* 2084 */           paramInt6 += i5;
/* 2085 */           paramInt8 += i8;
/* 2086 */           paramInt2 += j;
/* 2087 */           i9 += i11;
/* 2088 */           i12 += i14;
/* 2089 */           i15 += i17;
/*      */         }
/* 2091 */         return;
/*      */       }
/*      */ 
/* 2095 */       paramInt6 = paramInt5 <<= 16;
/* 2096 */       if (paramInt2 < 0) {
/* 2097 */         paramInt6 -= i3 * paramInt2;
/* 2098 */         paramInt5 -= i4 * paramInt2;
/* 2099 */         paramInt8 -= i8 * paramInt2;
/* 2100 */         paramInt2 = 0;
/*      */       }
/* 2102 */       paramInt4 <<= 16;
/* 2103 */       if (paramInt1 < 0) {
/* 2104 */         paramInt4 -= i5 * paramInt1;
/* 2105 */         paramInt1 = 0;
/*      */       }
/* 2107 */       i18 = paramInt2 - h;
/* 2108 */       i9 += i11 * i18;
/* 2109 */       i12 += i14 * i18;
/* 2110 */       i15 += i17 * i18;
/* 2111 */       if (i3 < i4) {
/* 2112 */         paramInt3 -= paramInt1;
/* 2113 */         paramInt1 -= paramInt2;
/* 2114 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2116 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2117 */           paramInt6 += i3;
/* 2118 */           paramInt5 += i4;
/* 2119 */           paramInt8 += i8;
/* 2120 */           paramInt2 += j;
/* 2121 */           i9 += i11;
/* 2122 */           i12 += i14;
/* 2123 */           i15 += i17; }
/*      */         while (true) {
/* 2125 */           paramInt3--; if (paramInt3 < 0) break;
/* 2126 */           ch(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2127 */           paramInt4 += i5;
/* 2128 */           paramInt5 += i4;
/* 2129 */           paramInt8 += i8;
/* 2130 */           paramInt2 += j;
/* 2131 */           i9 += i11;
/* 2132 */           i12 += i14;
/* 2133 */           i15 += i17;
/*      */         }
/* 2135 */         return;
/*      */       }
/*      */ 
/* 2138 */       paramInt3 -= paramInt1;
/* 2139 */       paramInt1 -= paramInt2;
/* 2140 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2142 */         ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2143 */         paramInt6 += i3;
/* 2144 */         paramInt5 += i4;
/* 2145 */         paramInt8 += i8;
/* 2146 */         paramInt2 += j;
/* 2147 */         i9 += i11;
/* 2148 */         i12 += i14;
/* 2149 */         i15 += i17; }
/*      */       while (true) {
/* 2151 */         paramInt3--; if (paramInt3 < 0) break;
/* 2152 */         ch(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 2153 */         paramInt4 += i5;
/* 2154 */         paramInt5 += i4;
/* 2155 */         paramInt8 += i8;
/* 2156 */         paramInt2 += j;
/* 2157 */         i9 += i11;
/* 2158 */         i12 += i14;
/* 2159 */         i15 += i17;
/*      */       }
/* 2161 */       return;
/*      */     }
/*      */ 
/* 2166 */     if (paramInt3 >= p) return;
/* 2167 */     if (paramInt1 > p) paramInt1 = p;
/* 2168 */     if (paramInt2 > p) paramInt2 = p;
/* 2169 */     paramInt9 = (paramInt9 << 9) - i7 * paramInt6 + i7;
/* 2170 */     if (paramInt1 < paramInt2) {
/* 2171 */       paramInt5 = paramInt6 <<= 16;
/* 2172 */       if (paramInt3 < 0) {
/* 2173 */         paramInt5 -= i4 * paramInt3;
/* 2174 */         paramInt6 -= i5 * paramInt3;
/* 2175 */         paramInt9 -= i8 * paramInt3;
/* 2176 */         paramInt3 = 0;
/*      */       }
/* 2178 */       paramInt4 <<= 16;
/* 2179 */       if (paramInt1 < 0) {
/* 2180 */         paramInt4 -= i3 * paramInt1;
/* 2181 */         paramInt1 = 0;
/*      */       }
/* 2183 */       i18 = paramInt3 - h;
/* 2184 */       i9 += i11 * i18;
/* 2185 */       i12 += i14 * i18;
/* 2186 */       i15 += i17 * i18;
/* 2187 */       if (i4 < i5) {
/* 2188 */         paramInt2 -= paramInt1;
/* 2189 */         paramInt1 -= paramInt3;
/* 2190 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2192 */           ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2193 */           paramInt5 += i4;
/* 2194 */           paramInt6 += i5;
/* 2195 */           paramInt9 += i8;
/* 2196 */           paramInt3 += j;
/* 2197 */           i9 += i11;
/* 2198 */           i12 += i14;
/* 2199 */           i15 += i17; }
/*      */         while (true) {
/* 2201 */           paramInt2--; if (paramInt2 < 0) break;
/* 2202 */           ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2203 */           paramInt5 += i4;
/* 2204 */           paramInt4 += i3;
/* 2205 */           paramInt9 += i8;
/* 2206 */           paramInt3 += j;
/* 2207 */           i9 += i11;
/* 2208 */           i12 += i14;
/* 2209 */           i15 += i17;
/*      */         }
/* 2211 */         return;
/*      */       }
/*      */ 
/* 2214 */       paramInt2 -= paramInt1;
/* 2215 */       paramInt1 -= paramInt3;
/* 2216 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 2218 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2219 */         paramInt5 += i4;
/* 2220 */         paramInt6 += i5;
/* 2221 */         paramInt9 += i8;
/* 2222 */         paramInt3 += j;
/* 2223 */         i9 += i11;
/* 2224 */         i12 += i14;
/* 2225 */         i15 += i17; }
/*      */       while (true) {
/* 2227 */         paramInt2--; if (paramInt2 < 0) break;
/* 2228 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2229 */         paramInt5 += i4;
/* 2230 */         paramInt4 += i3;
/* 2231 */         paramInt9 += i8;
/* 2232 */         paramInt3 += j;
/* 2233 */         i9 += i11;
/* 2234 */         i12 += i14;
/* 2235 */         i15 += i17;
/*      */       }
/* 2237 */       return;
/*      */     }
/*      */ 
/* 2241 */     paramInt4 = paramInt6 <<= 16;
/* 2242 */     if (paramInt3 < 0) {
/* 2243 */       paramInt4 -= i4 * paramInt3;
/* 2244 */       paramInt6 -= i5 * paramInt3;
/* 2245 */       paramInt9 -= i8 * paramInt3;
/* 2246 */       paramInt3 = 0;
/*      */     }
/* 2248 */     paramInt5 <<= 16;
/* 2249 */     if (paramInt2 < 0) {
/* 2250 */       paramInt5 -= i3 * paramInt2;
/* 2251 */       paramInt2 = 0;
/*      */     }
/* 2253 */     int i18 = paramInt3 - h;
/* 2254 */     i9 += i11 * i18;
/* 2255 */     i12 += i14 * i18;
/* 2256 */     i15 += i17 * i18;
/* 2257 */     if (i4 < i5) {
/* 2258 */       paramInt1 -= paramInt2;
/* 2259 */       paramInt2 -= paramInt3;
/* 2260 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 2262 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2263 */         paramInt4 += i4;
/* 2264 */         paramInt6 += i5;
/* 2265 */         paramInt9 += i8;
/* 2266 */         paramInt3 += j;
/* 2267 */         i9 += i11;
/* 2268 */         i12 += i14;
/* 2269 */         i15 += i17; }
/*      */       while (true) {
/* 2271 */         paramInt1--; if (paramInt1 < 0) break;
/* 2272 */         ch(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2273 */         paramInt5 += i3;
/* 2274 */         paramInt6 += i5;
/* 2275 */         paramInt9 += i8;
/* 2276 */         paramInt3 += j;
/* 2277 */         i9 += i11;
/* 2278 */         i12 += i14;
/* 2279 */         i15 += i17;
/*      */       }
/* 2281 */       return;
/*      */     }
/*      */ 
/* 2284 */     paramInt1 -= paramInt2;
/* 2285 */     paramInt2 -= paramInt3;
/* 2286 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 2288 */       ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2289 */       paramInt4 += i4;
/* 2290 */       paramInt6 += i5;
/* 2291 */       paramInt9 += i8;
/* 2292 */       paramInt3 += j;
/* 2293 */       i9 += i11;
/* 2294 */       i12 += i14;
/* 2295 */       i15 += i17; }
/*      */     while (true) {
/* 2297 */       paramInt1--; if (paramInt1 < 0) break;
/* 2298 */       ch(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 2299 */       paramInt5 += i3;
/* 2300 */       paramInt6 += i5;
/* 2301 */       paramInt9 += i8;
/* 2302 */       paramInt3 += j;
/* 2303 */       i9 += i11;
/* 2304 */       i12 += i14;
/* 2305 */       i15 += i17;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void dp(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  619 */     int i = 0;
/*  620 */     if (paramInt2 != paramInt1) i = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/*  621 */     int j = 0;
/*  622 */     if (paramInt3 != paramInt2) j = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/*  623 */     int m = 0;
/*  624 */     if (paramInt3 != paramInt1) m = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/*  625 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/*  626 */       if (paramInt1 >= p) return;
/*  627 */       if (paramInt2 > p) paramInt2 = p;
/*  628 */       if (paramInt3 > p) paramInt3 = p;
/*  629 */       if (paramInt2 < paramInt3) {
/*  630 */         paramInt6 = paramInt4 <<= 16;
/*  631 */         if (paramInt1 < 0) {
/*  632 */           paramInt6 -= m * paramInt1;
/*  633 */           paramInt4 -= i * paramInt1;
/*  634 */           paramInt1 = 0;
/*      */         }
/*  636 */         paramInt5 <<= 16;
/*  637 */         if (paramInt2 < 0) {
/*  638 */           paramInt5 -= j * paramInt2;
/*  639 */           paramInt2 = 0;
/*      */         }
/*  641 */         if (((paramInt1 != paramInt2) && (m < i)) || ((paramInt1 == paramInt2) && (m > j))) {
/*  642 */           paramInt3 -= paramInt2;
/*  643 */           paramInt2 -= paramInt1;
/*  644 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  646 */             cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  647 */             paramInt6 += m;
/*  648 */             paramInt4 += i;
/*  649 */             paramInt1 += j; }
/*      */           while (true) {
/*  651 */             paramInt3--; if (paramInt3 < 0) break;
/*  652 */             cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  653 */             paramInt6 += m;
/*  654 */             paramInt5 += j;
/*  655 */             paramInt1 += j;
/*      */           }
/*  657 */           return;
/*      */         }
/*      */ 
/*  660 */         paramInt3 -= paramInt2;
/*  661 */         paramInt2 -= paramInt1;
/*  662 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  664 */           cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  665 */           paramInt6 += m;
/*  666 */           paramInt4 += i;
/*  667 */           paramInt1 += j; }
/*      */         while (true) {
/*  669 */           paramInt3--; if (paramInt3 < 0) break;
/*  670 */           cl(n, paramInt1, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  671 */           paramInt6 += m;
/*  672 */           paramInt5 += j;
/*  673 */           paramInt1 += j;
/*      */         }
/*  675 */         return;
/*      */       }
/*      */ 
/*  679 */       paramInt5 = paramInt4 <<= 16;
/*  680 */       if (paramInt1 < 0) {
/*  681 */         paramInt5 -= m * paramInt1;
/*  682 */         paramInt4 -= i * paramInt1;
/*  683 */         paramInt1 = 0;
/*      */       }
/*  685 */       paramInt6 <<= 16;
/*  686 */       if (paramInt3 < 0) {
/*  687 */         paramInt6 -= j * paramInt3;
/*  688 */         paramInt3 = 0;
/*      */       }
/*  690 */       if (((paramInt1 != paramInt3) && (m < i)) || ((paramInt1 == paramInt3) && (j > i))) {
/*  691 */         paramInt2 -= paramInt3;
/*  692 */         paramInt3 -= paramInt1;
/*  693 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  695 */           cl(n, paramInt1, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  696 */           paramInt5 += m;
/*  697 */           paramInt4 += i;
/*  698 */           paramInt1 += j; }
/*      */         while (true) {
/*  700 */           paramInt2--; if (paramInt2 < 0) break;
/*  701 */           cl(n, paramInt1, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  702 */           paramInt6 += j;
/*  703 */           paramInt4 += i;
/*  704 */           paramInt1 += j;
/*      */         }
/*  706 */         return;
/*      */       }
/*      */ 
/*  709 */       paramInt2 -= paramInt3;
/*  710 */       paramInt3 -= paramInt1;
/*  711 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  713 */         cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  714 */         paramInt5 += m;
/*  715 */         paramInt4 += i;
/*  716 */         paramInt1 += j; }
/*      */       while (true) {
/*  718 */         paramInt2--; if (paramInt2 < 0) break;
/*  719 */         cl(n, paramInt1, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  720 */         paramInt6 += j;
/*  721 */         paramInt4 += i;
/*  722 */         paramInt1 += j;
/*      */       }
/*  724 */       return;
/*      */     }
/*      */ 
/*  728 */     if (paramInt2 <= paramInt3) {
/*  729 */       if (paramInt2 >= p) return;
/*  730 */       if (paramInt3 > p) paramInt3 = p;
/*  731 */       if (paramInt1 > p) paramInt1 = p;
/*  732 */       if (paramInt3 < paramInt1) {
/*  733 */         paramInt4 = paramInt5 <<= 16;
/*  734 */         if (paramInt2 < 0) {
/*  735 */           paramInt4 -= i * paramInt2;
/*  736 */           paramInt5 -= j * paramInt2;
/*  737 */           paramInt2 = 0;
/*      */         }
/*  739 */         paramInt6 <<= 16;
/*  740 */         if (paramInt3 < 0) {
/*  741 */           paramInt6 -= m * paramInt3;
/*  742 */           paramInt3 = 0;
/*      */         }
/*  744 */         if (((paramInt2 != paramInt3) && (i < j)) || ((paramInt2 == paramInt3) && (i > m))) {
/*  745 */           paramInt1 -= paramInt3;
/*  746 */           paramInt3 -= paramInt2;
/*  747 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  749 */             cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  750 */             paramInt4 += i;
/*  751 */             paramInt5 += j;
/*  752 */             paramInt2 += j; }
/*      */           while (true) {
/*  754 */             paramInt1--; if (paramInt1 < 0) break;
/*  755 */             cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  756 */             paramInt4 += i;
/*  757 */             paramInt6 += m;
/*  758 */             paramInt2 += j;
/*      */           }
/*  760 */           return;
/*      */         }
/*      */ 
/*  763 */         paramInt1 -= paramInt3;
/*  764 */         paramInt3 -= paramInt2;
/*  765 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/*  767 */           cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  768 */           paramInt4 += i;
/*  769 */           paramInt5 += j;
/*  770 */           paramInt2 += j; }
/*      */         while (true) {
/*  772 */           paramInt1--; if (paramInt1 < 0) break;
/*  773 */           cl(n, paramInt2, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  774 */           paramInt4 += i;
/*  775 */           paramInt6 += m;
/*  776 */           paramInt2 += j;
/*      */         }
/*  778 */         return;
/*      */       }
/*      */ 
/*  782 */       paramInt6 = paramInt5 <<= 16;
/*  783 */       if (paramInt2 < 0) {
/*  784 */         paramInt6 -= i * paramInt2;
/*  785 */         paramInt5 -= j * paramInt2;
/*  786 */         paramInt2 = 0;
/*      */       }
/*  788 */       paramInt4 <<= 16;
/*  789 */       if (paramInt1 < 0) {
/*  790 */         paramInt4 -= m * paramInt1;
/*  791 */         paramInt1 = 0;
/*      */       }
/*  793 */       if (i < j) {
/*  794 */         paramInt3 -= paramInt1;
/*  795 */         paramInt1 -= paramInt2;
/*  796 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  798 */           cl(n, paramInt2, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  799 */           paramInt6 += i;
/*  800 */           paramInt5 += j;
/*  801 */           paramInt2 += j; }
/*      */         while (true) {
/*  803 */           paramInt3--; if (paramInt3 < 0) break;
/*  804 */           cl(n, paramInt2, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  805 */           paramInt4 += m;
/*  806 */           paramInt5 += j;
/*  807 */           paramInt2 += j;
/*      */         }
/*  809 */         return;
/*      */       }
/*      */ 
/*  812 */       paramInt3 -= paramInt1;
/*  813 */       paramInt1 -= paramInt2;
/*  814 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  816 */         cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  817 */         paramInt6 += i;
/*  818 */         paramInt5 += j;
/*  819 */         paramInt2 += j; }
/*      */       while (true) {
/*  821 */         paramInt3--; if (paramInt3 < 0) break;
/*  822 */         cl(n, paramInt2, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  823 */         paramInt4 += m;
/*  824 */         paramInt5 += j;
/*  825 */         paramInt2 += j;
/*      */       }
/*  827 */       return;
/*      */     }
/*      */ 
/*  832 */     if (paramInt3 >= p) return;
/*  833 */     if (paramInt1 > p) paramInt1 = p;
/*  834 */     if (paramInt2 > p) paramInt2 = p;
/*  835 */     if (paramInt1 < paramInt2) {
/*  836 */       paramInt5 = paramInt6 <<= 16;
/*  837 */       if (paramInt3 < 0) {
/*  838 */         paramInt5 -= j * paramInt3;
/*  839 */         paramInt6 -= m * paramInt3;
/*  840 */         paramInt3 = 0;
/*      */       }
/*  842 */       paramInt4 <<= 16;
/*  843 */       if (paramInt1 < 0) {
/*  844 */         paramInt4 -= i * paramInt1;
/*  845 */         paramInt1 = 0;
/*      */       }
/*  847 */       if (j < m) {
/*  848 */         paramInt2 -= paramInt1;
/*  849 */         paramInt1 -= paramInt3;
/*  850 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  852 */           cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  853 */           paramInt5 += j;
/*  854 */           paramInt6 += m;
/*  855 */           paramInt3 += j; }
/*      */         while (true) {
/*  857 */           paramInt2--; if (paramInt2 < 0) break;
/*  858 */           cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt4 >> 16);
/*  859 */           paramInt5 += j;
/*  860 */           paramInt4 += i;
/*  861 */           paramInt3 += j;
/*      */         }
/*  863 */         return;
/*      */       }
/*      */ 
/*  866 */       paramInt2 -= paramInt1;
/*  867 */       paramInt1 -= paramInt3;
/*  868 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/*  870 */         cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  871 */         paramInt5 += j;
/*  872 */         paramInt6 += m;
/*  873 */         paramInt3 += j; }
/*      */       while (true) {
/*  875 */         paramInt2--; if (paramInt2 < 0) break;
/*  876 */         cl(n, paramInt3, paramInt7, 0, paramInt4 >> 16, paramInt5 >> 16);
/*  877 */         paramInt5 += j;
/*  878 */         paramInt4 += i;
/*  879 */         paramInt3 += j;
/*      */       }
/*  881 */       return;
/*      */     }
/*      */ 
/*  885 */     paramInt4 = paramInt6 <<= 16;
/*  886 */     if (paramInt3 < 0) {
/*  887 */       paramInt4 -= j * paramInt3;
/*  888 */       paramInt6 -= m * paramInt3;
/*  889 */       paramInt3 = 0;
/*      */     }
/*  891 */     paramInt5 <<= 16;
/*  892 */     if (paramInt2 < 0) {
/*  893 */       paramInt5 -= i * paramInt2;
/*  894 */       paramInt2 = 0;
/*      */     }
/*  896 */     if (j < m) {
/*  897 */       paramInt1 -= paramInt2;
/*  898 */       paramInt2 -= paramInt3;
/*  899 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  901 */         cl(n, paramInt3, paramInt7, 0, paramInt4 >> 16, paramInt6 >> 16);
/*  902 */         paramInt4 += j;
/*  903 */         paramInt6 += m;
/*  904 */         paramInt3 += j; }
/*      */       while (true) {
/*  906 */         paramInt1--; if (paramInt1 < 0) break;
/*  907 */         cl(n, paramInt3, paramInt7, 0, paramInt5 >> 16, paramInt6 >> 16);
/*  908 */         paramInt5 += i;
/*  909 */         paramInt6 += m;
/*  910 */         paramInt3 += j;
/*      */       }
/*  912 */       return;
/*      */     }
/*      */ 
/*  915 */     paramInt1 -= paramInt2;
/*  916 */     paramInt2 -= paramInt3;
/*  917 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/*  919 */       cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt4 >> 16);
/*  920 */       paramInt4 += j;
/*  921 */       paramInt6 += m;
/*  922 */       paramInt3 += j; }
/*      */     while (true) {
/*  924 */       paramInt1--; if (paramInt1 < 0) break;
/*  925 */       cl(n, paramInt3, paramInt7, 0, paramInt6 >> 16, paramInt5 >> 16);
/*  926 */       paramInt5 += i;
/*  927 */       paramInt6 += m;
/*  928 */       paramInt3 += j;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void ch(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 2316 */     if (u) {
/* 2317 */       if (paramInt5 > x) paramInt5 = x;
/* 2318 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 2320 */     if (paramInt4 >= paramInt5) return;
/* 2321 */     paramInt3 += paramInt4;
/* 2322 */     paramInt6 += paramInt7 * paramInt4;
/* 2323 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 2324 */     if (w)
/*      */     {
/* 2331 */       i5 = paramInt4 - a;
/* 2332 */       paramInt8 += paramInt11 * i5;
/* 2333 */       paramInt9 += paramInt12 * i5;
/* 2334 */       paramInt10 += paramInt13 * i5;
/* 2335 */       i4 = paramInt10 >> 12;
/* 2336 */       if (i4 != 0) {
/* 2337 */         n = paramInt8 / i4;
/* 2338 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2341 */         n = 0;
/* 2342 */         i1 = 0;
/*      */       }
/* 2344 */       paramInt8 += paramInt11 * m;
/* 2345 */       paramInt9 += paramInt12 * m;
/* 2346 */       paramInt10 += paramInt13 * m;
/* 2347 */       i4 = paramInt10 >> 12;
/* 2348 */       if (i4 != 0) {
/* 2349 */         i2 = paramInt8 / i4;
/* 2350 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2353 */         i2 = 0;
/* 2354 */         i3 = 0;
/*      */       }
/* 2356 */       paramInt1 = (n << 20) + i1;
/* 2357 */       j = ((i2 - n) / m << 20) + (i3 - i1) / m;
/* 2358 */       m >>= 3;
/* 2359 */       paramInt7 <<= 3;
/* 2360 */       i = paramInt6 >> 8;
/*      */ 
/* 2362 */       if (v) {
/* 2363 */         if (m > 0) {
/*      */           do {
/* 2365 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2366 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2367 */             paramInt1 += j;
/* 2368 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2369 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2370 */             paramInt1 += j;
/* 2371 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2372 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2373 */             paramInt1 += j;
/* 2374 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2375 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2376 */             paramInt1 += j;
/* 2377 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2378 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2379 */             paramInt1 += j;
/* 2380 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2381 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2382 */             paramInt1 += j;
/* 2383 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2384 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2385 */             paramInt1 += j;
/* 2386 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2387 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2388 */             paramInt1 += j;
/* 2389 */             paramInt6 += paramInt7;
/* 2390 */             i = paramInt6 >> 8;
/* 2391 */             m--; } while (m > 0);
/*      */         }
/* 2393 */         m = paramInt5 - paramInt4 & 0x7;
/* 2394 */         if (m > 0)
/*      */           do {
/* 2396 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2397 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2398 */             paramInt1 += j;
/* 2399 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2403 */         if (m > 0) {
/*      */           do {
/* 2405 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2406 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2408 */             paramInt3++;
/* 2409 */             paramInt1 += j;
/* 2410 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2411 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2413 */             paramInt3++;
/* 2414 */             paramInt1 += j;
/* 2415 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2416 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2418 */             paramInt3++;
/* 2419 */             paramInt1 += j;
/* 2420 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2421 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2423 */             paramInt3++;
/* 2424 */             paramInt1 += j;
/* 2425 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2426 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2428 */             paramInt3++;
/* 2429 */             paramInt1 += j;
/* 2430 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2431 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2433 */             paramInt3++;
/* 2434 */             paramInt1 += j;
/* 2435 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2436 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2438 */             paramInt3++;
/* 2439 */             paramInt1 += j;
/* 2440 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2441 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2443 */             paramInt3++;
/* 2444 */             paramInt1 += j;
/* 2445 */             paramInt6 += paramInt7;
/* 2446 */             i = paramInt6 >> 8;
/* 2447 */             m--; } while (m > 0);
/*      */         }
/* 2449 */         m = paramInt5 - paramInt4 & 0x7;
/* 2450 */         if (m > 0) {
/*      */           do {
/* 2452 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2453 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2455 */             paramInt3++;
/* 2456 */             paramInt1 += j;
/* 2457 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 2468 */       i5 = paramInt4 - a;
/* 2469 */       paramInt8 += paramInt11 * i5;
/* 2470 */       paramInt9 += paramInt12 * i5;
/* 2471 */       paramInt10 += paramInt13 * i5;
/* 2472 */       i4 = paramInt10 >> 14;
/* 2473 */       if (i4 != 0) {
/* 2474 */         n = paramInt8 / i4;
/* 2475 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2478 */         n = 0;
/* 2479 */         i1 = 0;
/*      */       }
/* 2481 */       paramInt8 += paramInt11 * m;
/* 2482 */       paramInt9 += paramInt12 * m;
/* 2483 */       paramInt10 += paramInt13 * m;
/* 2484 */       i4 = paramInt10 >> 14;
/* 2485 */       if (i4 != 0) {
/* 2486 */         i2 = paramInt8 / i4;
/* 2487 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2490 */         i2 = 0;
/* 2491 */         i3 = 0;
/*      */       }
/* 2493 */       paramInt1 = (n << 18) + i1;
/* 2494 */       j = ((i2 - n) / m << 18) + (i3 - i1) / m;
/* 2495 */       m >>= 3;
/* 2496 */       paramInt7 <<= 3;
/* 2497 */       i = paramInt6 >> 8;
/*      */ 
/* 2499 */       if (v) {
/* 2500 */         if (m > 0) {
/*      */           do {
/* 2502 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2503 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2504 */             paramInt1 += j;
/* 2505 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2506 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2507 */             paramInt1 += j;
/* 2508 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2509 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2510 */             paramInt1 += j;
/* 2511 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2512 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2513 */             paramInt1 += j;
/* 2514 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2515 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2516 */             paramInt1 += j;
/* 2517 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2518 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2519 */             paramInt1 += j;
/* 2520 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2521 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2522 */             paramInt1 += j;
/* 2523 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2524 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2525 */             paramInt1 += j;
/* 2526 */             paramInt6 += paramInt7;
/* 2527 */             i = paramInt6 >> 8;
/* 2528 */             m--; } while (m > 0);
/*      */         }
/* 2530 */         m = paramInt5 - paramInt4 & 0x7;
/* 2531 */         if (m > 0)
/*      */           do {
/* 2533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2535 */             paramInt1 += j;
/* 2536 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2540 */         if (m > 0) {
/*      */           do {
/* 2542 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2543 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2545 */             paramInt3++;
/* 2546 */             paramInt1 += j;
/* 2547 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2548 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2550 */             paramInt3++;
/* 2551 */             paramInt1 += j;
/* 2552 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2553 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2555 */             paramInt3++;
/* 2556 */             paramInt1 += j;
/* 2557 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2558 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2560 */             paramInt3++;
/* 2561 */             paramInt1 += j;
/* 2562 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2563 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2565 */             paramInt3++;
/* 2566 */             paramInt1 += j;
/* 2567 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2568 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2570 */             paramInt3++;
/* 2571 */             paramInt1 += j;
/* 2572 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2573 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2575 */             paramInt3++;
/* 2576 */             paramInt1 += j;
/* 2577 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2578 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2580 */             paramInt3++;
/* 2581 */             paramInt1 += j;
/* 2582 */             paramInt6 += paramInt7;
/* 2583 */             i = paramInt6 >> 8;
/* 2584 */             m--; } while (m > 0);
/*      */         }
/* 2586 */         m = paramInt5 - paramInt4 & 0x7;
/* 2587 */         if (m > 0)
/*      */           do {
/* 2589 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2590 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2592 */             paramInt3++;
/* 2593 */             paramInt1 += j;
/* 2594 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void di(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19)
/*      */   {
/*  991 */     int[] arrayOfInt = av.r(paramInt19, -112476939);
/*  992 */     if (arrayOfInt == null) {
/*  993 */       i = av.d(paramInt19, -2138274608);
/*  994 */       cr(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, cu(i, paramInt7), cu(i, paramInt8), cu(i, paramInt9));
/*  995 */       return;
/*      */     }
/*  997 */     w = av.m(paramInt19, 1760452429);
/*  998 */     v = av.l(paramInt19, -633535611);
/*  999 */     int i = paramInt5 - paramInt4;
/* 1000 */     int j = paramInt2 - paramInt1;
/* 1001 */     int m = paramInt6 - paramInt4;
/* 1002 */     int n = paramInt3 - paramInt1;
/* 1003 */     int i1 = paramInt8 - paramInt7;
/* 1004 */     int i2 = paramInt9 - paramInt7;
/* 1005 */     int i3 = 0;
/* 1006 */     if (paramInt2 != paramInt1) i3 = (paramInt5 - paramInt4 << 16) / (paramInt2 - paramInt1);
/* 1007 */     int i4 = 0;
/* 1008 */     if (paramInt3 != paramInt2) i4 = (paramInt6 - paramInt5 << 16) / (paramInt3 - paramInt2);
/* 1009 */     int i5 = 0;
/* 1010 */     if (paramInt3 != paramInt1) i5 = (paramInt4 - paramInt6 << 16) / (paramInt1 - paramInt3);
/* 1011 */     int i6 = i * n - m * j;
/* 1012 */     if (i6 == 0) return;
/* 1013 */     int i7 = (i1 * n - i2 * j << 9) / i6;
/* 1014 */     int i8 = (i2 * i - i1 * m << 9) / i6;
/* 1015 */     paramInt11 = paramInt10 - paramInt11;
/* 1016 */     paramInt14 = paramInt13 - paramInt14;
/* 1017 */     paramInt17 = paramInt16 - paramInt17;
/* 1018 */     paramInt12 -= paramInt10;
/* 1019 */     paramInt15 -= paramInt13;
/* 1020 */     paramInt18 -= paramInt16;
/* 1021 */     int i9 = paramInt12 * paramInt13 - paramInt15 * paramInt10 << 14;
/* 1022 */     int i10 = paramInt15 * paramInt16 - paramInt18 * paramInt13 << 8;
/* 1023 */     int i11 = paramInt18 * paramInt10 - paramInt12 * paramInt16 << 5;
/* 1024 */     int i12 = paramInt11 * paramInt13 - paramInt14 * paramInt10 << 14;
/* 1025 */     int i13 = paramInt14 * paramInt16 - paramInt17 * paramInt13 << 8;
/* 1026 */     int i14 = paramInt17 * paramInt10 - paramInt11 * paramInt16 << 5;
/* 1027 */     int i15 = paramInt14 * paramInt12 - paramInt11 * paramInt15 << 14;
/* 1028 */     int i16 = paramInt17 * paramInt15 - paramInt14 * paramInt18 << 8;
/* 1029 */     int i17 = paramInt11 * paramInt18 - paramInt17 * paramInt12 << 5;
/* 1030 */     if ((paramInt1 <= paramInt2) && (paramInt1 <= paramInt3)) {
/* 1031 */       if (paramInt1 >= p) return;
/* 1032 */       if (paramInt2 > p) paramInt2 = p;
/* 1033 */       if (paramInt3 > p) paramInt3 = p;
/* 1034 */       paramInt7 = (paramInt7 << 9) - i7 * paramInt4 + i7;
/* 1035 */       if (paramInt2 < paramInt3) {
/* 1036 */         paramInt6 = paramInt4 <<= 16;
/* 1037 */         if (paramInt1 < 0) {
/* 1038 */           paramInt6 -= i5 * paramInt1;
/* 1039 */           paramInt4 -= i3 * paramInt1;
/* 1040 */           paramInt7 -= i8 * paramInt1;
/* 1041 */           paramInt1 = 0;
/*      */         }
/* 1043 */         paramInt5 <<= 16;
/* 1044 */         if (paramInt2 < 0) {
/* 1045 */           paramInt5 -= i4 * paramInt2;
/* 1046 */           paramInt2 = 0;
/*      */         }
/* 1048 */         i18 = paramInt1 - h;
/* 1049 */         i9 += i11 * i18;
/* 1050 */         i12 += i14 * i18;
/* 1051 */         i15 += i17 * i18;
/* 1052 */         if (((paramInt1 != paramInt2) && (i5 < i3)) || ((paramInt1 == paramInt2) && (i5 > i4))) {
/* 1053 */           paramInt3 -= paramInt2;
/* 1054 */           paramInt2 -= paramInt1;
/* 1055 */           paramInt1 = am[paramInt1];
/*      */           while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1057 */             ca(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1058 */             paramInt6 += i5;
/* 1059 */             paramInt4 += i3;
/* 1060 */             paramInt7 += i8;
/* 1061 */             paramInt1 += j;
/* 1062 */             i9 += i11;
/* 1063 */             i12 += i14;
/* 1064 */             i15 += i17; }
/*      */           while (true) {
/* 1066 */             paramInt3--; if (paramInt3 < 0) break;
/* 1067 */             ca(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1068 */             paramInt6 += i5;
/* 1069 */             paramInt5 += i4;
/* 1070 */             paramInt7 += i8;
/* 1071 */             paramInt1 += j;
/* 1072 */             i9 += i11;
/* 1073 */             i12 += i14;
/* 1074 */             i15 += i17;
/*      */           }
/* 1076 */           return;
/*      */         }
/*      */ 
/* 1079 */         paramInt3 -= paramInt2;
/* 1080 */         paramInt2 -= paramInt1;
/* 1081 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1083 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1084 */           paramInt6 += i5;
/* 1085 */           paramInt4 += i3;
/* 1086 */           paramInt7 += i8;
/* 1087 */           paramInt1 += j;
/* 1088 */           i9 += i11;
/* 1089 */           i12 += i14;
/* 1090 */           i15 += i17; }
/*      */         while (true) {
/* 1092 */           paramInt3--; if (paramInt3 < 0) break;
/* 1093 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1094 */           paramInt6 += i5;
/* 1095 */           paramInt5 += i4;
/* 1096 */           paramInt7 += i8;
/* 1097 */           paramInt1 += j;
/* 1098 */           i9 += i11;
/* 1099 */           i12 += i14;
/* 1100 */           i15 += i17;
/*      */         }
/* 1102 */         return;
/*      */       }
/*      */ 
/* 1106 */       paramInt5 = paramInt4 <<= 16;
/* 1107 */       if (paramInt1 < 0) {
/* 1108 */         paramInt5 -= i5 * paramInt1;
/* 1109 */         paramInt4 -= i3 * paramInt1;
/* 1110 */         paramInt7 -= i8 * paramInt1;
/* 1111 */         paramInt1 = 0;
/*      */       }
/* 1113 */       paramInt6 <<= 16;
/* 1114 */       if (paramInt3 < 0) {
/* 1115 */         paramInt6 -= i4 * paramInt3;
/* 1116 */         paramInt3 = 0;
/*      */       }
/* 1118 */       i18 = paramInt1 - h;
/* 1119 */       i9 += i11 * i18;
/* 1120 */       i12 += i14 * i18;
/* 1121 */       i15 += i17 * i18;
/* 1122 */       if (((paramInt1 != paramInt3) && (i5 < i3)) || ((paramInt1 == paramInt3) && (i4 > i3))) {
/* 1123 */         paramInt2 -= paramInt3;
/* 1124 */         paramInt3 -= paramInt1;
/* 1125 */         paramInt1 = am[paramInt1];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1127 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt5 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1128 */           paramInt5 += i5;
/* 1129 */           paramInt4 += i3;
/* 1130 */           paramInt7 += i8;
/* 1131 */           paramInt1 += j;
/* 1132 */           i9 += i11;
/* 1133 */           i12 += i14;
/* 1134 */           i15 += i17; }
/*      */         while (true) {
/* 1136 */           paramInt2--; if (paramInt2 < 0) break;
/* 1137 */           ca(n, arrayOfInt, 0, 0, paramInt1, paramInt6 >> 16, paramInt4 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1138 */           paramInt6 += i4;
/* 1139 */           paramInt4 += i3;
/* 1140 */           paramInt7 += i8;
/* 1141 */           paramInt1 += j;
/* 1142 */           i9 += i11;
/* 1143 */           i12 += i14;
/* 1144 */           i15 += i17;
/*      */         }
/* 1146 */         return;
/*      */       }
/*      */ 
/* 1149 */       paramInt2 -= paramInt3;
/* 1150 */       paramInt3 -= paramInt1;
/* 1151 */       paramInt1 = am[paramInt1];
/*      */       while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1153 */         ca(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt5 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1154 */         paramInt5 += i5;
/* 1155 */         paramInt4 += i3;
/* 1156 */         paramInt7 += i8;
/* 1157 */         paramInt1 += j;
/* 1158 */         i9 += i11;
/* 1159 */         i12 += i14;
/* 1160 */         i15 += i17; }
/*      */       while (true) {
/* 1162 */         paramInt2--; if (paramInt2 < 0) break;
/* 1163 */         ca(n, arrayOfInt, 0, 0, paramInt1, paramInt4 >> 16, paramInt6 >> 16, paramInt7, i7, i9, i12, i15, i10, i13, i16);
/* 1164 */         paramInt6 += i4;
/* 1165 */         paramInt4 += i3;
/* 1166 */         paramInt7 += i8;
/* 1167 */         paramInt1 += j;
/* 1168 */         i9 += i11;
/* 1169 */         i12 += i14;
/* 1170 */         i15 += i17;
/*      */       }
/* 1172 */       return;
/*      */     }
/*      */ 
/* 1176 */     if (paramInt2 <= paramInt3) {
/* 1177 */       if (paramInt2 >= p) return;
/* 1178 */       if (paramInt3 > p) paramInt3 = p;
/* 1179 */       if (paramInt1 > p) paramInt1 = p;
/* 1180 */       paramInt8 = (paramInt8 << 9) - i7 * paramInt5 + i7;
/* 1181 */       if (paramInt3 < paramInt1) {
/* 1182 */         paramInt4 = paramInt5 <<= 16;
/* 1183 */         if (paramInt2 < 0) {
/* 1184 */           paramInt4 -= i3 * paramInt2;
/* 1185 */           paramInt5 -= i4 * paramInt2;
/* 1186 */           paramInt8 -= i8 * paramInt2;
/* 1187 */           paramInt2 = 0;
/*      */         }
/* 1189 */         paramInt6 <<= 16;
/* 1190 */         if (paramInt3 < 0) {
/* 1191 */           paramInt6 -= i5 * paramInt3;
/* 1192 */           paramInt3 = 0;
/*      */         }
/* 1194 */         i18 = paramInt2 - h;
/* 1195 */         i9 += i11 * i18;
/* 1196 */         i12 += i14 * i18;
/* 1197 */         i15 += i17 * i18;
/* 1198 */         if (((paramInt2 != paramInt3) && (i3 < i4)) || ((paramInt2 == paramInt3) && (i3 > i5))) {
/* 1199 */           paramInt1 -= paramInt3;
/* 1200 */           paramInt3 -= paramInt2;
/* 1201 */           paramInt2 = am[paramInt2];
/*      */           while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1203 */             ca(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1204 */             paramInt4 += i3;
/* 1205 */             paramInt5 += i4;
/* 1206 */             paramInt8 += i8;
/* 1207 */             paramInt2 += j;
/* 1208 */             i9 += i11;
/* 1209 */             i12 += i14;
/* 1210 */             i15 += i17; }
/*      */           while (true) {
/* 1212 */             paramInt1--; if (paramInt1 < 0) break;
/* 1213 */             ca(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1214 */             paramInt4 += i3;
/* 1215 */             paramInt6 += i5;
/* 1216 */             paramInt8 += i8;
/* 1217 */             paramInt2 += j;
/* 1218 */             i9 += i11;
/* 1219 */             i12 += i14;
/* 1220 */             i15 += i17;
/*      */           }
/* 1222 */           return;
/*      */         }
/*      */ 
/* 1225 */         paramInt1 -= paramInt3;
/* 1226 */         paramInt3 -= paramInt2;
/* 1227 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt3--; if (paramInt3 < 0) break;
/* 1229 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1230 */           paramInt4 += i3;
/* 1231 */           paramInt5 += i4;
/* 1232 */           paramInt8 += i8;
/* 1233 */           paramInt2 += j;
/* 1234 */           i9 += i11;
/* 1235 */           i12 += i14;
/* 1236 */           i15 += i17; }
/*      */         while (true) {
/* 1238 */           paramInt1--; if (paramInt1 < 0) break;
/* 1239 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1240 */           paramInt4 += i3;
/* 1241 */           paramInt6 += i5;
/* 1242 */           paramInt8 += i8;
/* 1243 */           paramInt2 += j;
/* 1244 */           i9 += i11;
/* 1245 */           i12 += i14;
/* 1246 */           i15 += i17;
/*      */         }
/* 1248 */         return;
/*      */       }
/*      */ 
/* 1252 */       paramInt6 = paramInt5 <<= 16;
/* 1253 */       if (paramInt2 < 0) {
/* 1254 */         paramInt6 -= i3 * paramInt2;
/* 1255 */         paramInt5 -= i4 * paramInt2;
/* 1256 */         paramInt8 -= i8 * paramInt2;
/* 1257 */         paramInt2 = 0;
/*      */       }
/* 1259 */       paramInt4 <<= 16;
/* 1260 */       if (paramInt1 < 0) {
/* 1261 */         paramInt4 -= i5 * paramInt1;
/* 1262 */         paramInt1 = 0;
/*      */       }
/* 1264 */       i18 = paramInt2 - h;
/* 1265 */       i9 += i11 * i18;
/* 1266 */       i12 += i14 * i18;
/* 1267 */       i15 += i17 * i18;
/* 1268 */       if (i3 < i4) {
/* 1269 */         paramInt3 -= paramInt1;
/* 1270 */         paramInt1 -= paramInt2;
/* 1271 */         paramInt2 = am[paramInt2];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1273 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt6 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1274 */           paramInt6 += i3;
/* 1275 */           paramInt5 += i4;
/* 1276 */           paramInt8 += i8;
/* 1277 */           paramInt2 += j;
/* 1278 */           i9 += i11;
/* 1279 */           i12 += i14;
/* 1280 */           i15 += i17; }
/*      */         while (true) {
/* 1282 */           paramInt3--; if (paramInt3 < 0) break;
/* 1283 */           ca(n, arrayOfInt, 0, 0, paramInt2, paramInt4 >> 16, paramInt5 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1284 */           paramInt4 += i5;
/* 1285 */           paramInt5 += i4;
/* 1286 */           paramInt8 += i8;
/* 1287 */           paramInt2 += j;
/* 1288 */           i9 += i11;
/* 1289 */           i12 += i14;
/* 1290 */           i15 += i17;
/*      */         }
/* 1292 */         return;
/*      */       }
/*      */ 
/* 1295 */       paramInt3 -= paramInt1;
/* 1296 */       paramInt1 -= paramInt2;
/* 1297 */       paramInt2 = am[paramInt2];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1299 */         ca(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt6 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1300 */         paramInt6 += i3;
/* 1301 */         paramInt5 += i4;
/* 1302 */         paramInt8 += i8;
/* 1303 */         paramInt2 += j;
/* 1304 */         i9 += i11;
/* 1305 */         i12 += i14;
/* 1306 */         i15 += i17; }
/*      */       while (true) {
/* 1308 */         paramInt3--; if (paramInt3 < 0) break;
/* 1309 */         ca(n, arrayOfInt, 0, 0, paramInt2, paramInt5 >> 16, paramInt4 >> 16, paramInt8, i7, i9, i12, i15, i10, i13, i16);
/* 1310 */         paramInt4 += i5;
/* 1311 */         paramInt5 += i4;
/* 1312 */         paramInt8 += i8;
/* 1313 */         paramInt2 += j;
/* 1314 */         i9 += i11;
/* 1315 */         i12 += i14;
/* 1316 */         i15 += i17;
/*      */       }
/* 1318 */       return;
/*      */     }
/*      */ 
/* 1323 */     if (paramInt3 >= p) return;
/* 1324 */     if (paramInt1 > p) paramInt1 = p;
/* 1325 */     if (paramInt2 > p) paramInt2 = p;
/* 1326 */     paramInt9 = (paramInt9 << 9) - i7 * paramInt6 + i7;
/* 1327 */     if (paramInt1 < paramInt2) {
/* 1328 */       paramInt5 = paramInt6 <<= 16;
/* 1329 */       if (paramInt3 < 0) {
/* 1330 */         paramInt5 -= i4 * paramInt3;
/* 1331 */         paramInt6 -= i5 * paramInt3;
/* 1332 */         paramInt9 -= i8 * paramInt3;
/* 1333 */         paramInt3 = 0;
/*      */       }
/* 1335 */       paramInt4 <<= 16;
/* 1336 */       if (paramInt1 < 0) {
/* 1337 */         paramInt4 -= i3 * paramInt1;
/* 1338 */         paramInt1 = 0;
/*      */       }
/* 1340 */       i18 = paramInt3 - h;
/* 1341 */       i9 += i11 * i18;
/* 1342 */       i12 += i14 * i18;
/* 1343 */       i15 += i17 * i18;
/* 1344 */       if (i4 < i5) {
/* 1345 */         paramInt2 -= paramInt1;
/* 1346 */         paramInt1 -= paramInt3;
/* 1347 */         paramInt3 = am[paramInt3];
/*      */         while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1349 */           ca(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1350 */           paramInt5 += i4;
/* 1351 */           paramInt6 += i5;
/* 1352 */           paramInt9 += i8;
/* 1353 */           paramInt3 += j;
/* 1354 */           i9 += i11;
/* 1355 */           i12 += i14;
/* 1356 */           i15 += i17; }
/*      */         while (true) {
/* 1358 */           paramInt2--; if (paramInt2 < 0) break;
/* 1359 */           ca(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1360 */           paramInt5 += i4;
/* 1361 */           paramInt4 += i3;
/* 1362 */           paramInt9 += i8;
/* 1363 */           paramInt3 += j;
/* 1364 */           i9 += i11;
/* 1365 */           i12 += i14;
/* 1366 */           i15 += i17;
/*      */         }
/* 1368 */         return;
/*      */       }
/*      */ 
/* 1371 */       paramInt2 -= paramInt1;
/* 1372 */       paramInt1 -= paramInt3;
/* 1373 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt1--; if (paramInt1 < 0) break;
/* 1375 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1376 */         paramInt5 += i4;
/* 1377 */         paramInt6 += i5;
/* 1378 */         paramInt9 += i8;
/* 1379 */         paramInt3 += j;
/* 1380 */         i9 += i11;
/* 1381 */         i12 += i14;
/* 1382 */         i15 += i17; }
/*      */       while (true) {
/* 1384 */         paramInt2--; if (paramInt2 < 0) break;
/* 1385 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1386 */         paramInt5 += i4;
/* 1387 */         paramInt4 += i3;
/* 1388 */         paramInt9 += i8;
/* 1389 */         paramInt3 += j;
/* 1390 */         i9 += i11;
/* 1391 */         i12 += i14;
/* 1392 */         i15 += i17;
/*      */       }
/* 1394 */       return;
/*      */     }
/*      */ 
/* 1398 */     paramInt4 = paramInt6 <<= 16;
/* 1399 */     if (paramInt3 < 0) {
/* 1400 */       paramInt4 -= i4 * paramInt3;
/* 1401 */       paramInt6 -= i5 * paramInt3;
/* 1402 */       paramInt9 -= i8 * paramInt3;
/* 1403 */       paramInt3 = 0;
/*      */     }
/* 1405 */     paramInt5 <<= 16;
/* 1406 */     if (paramInt2 < 0) {
/* 1407 */       paramInt5 -= i3 * paramInt2;
/* 1408 */       paramInt2 = 0;
/*      */     }
/* 1410 */     int i18 = paramInt3 - h;
/* 1411 */     i9 += i11 * i18;
/* 1412 */     i12 += i14 * i18;
/* 1413 */     i15 += i17 * i18;
/* 1414 */     if (i4 < i5) {
/* 1415 */       paramInt1 -= paramInt2;
/* 1416 */       paramInt2 -= paramInt3;
/* 1417 */       paramInt3 = am[paramInt3];
/*      */       while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1419 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt4 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1420 */         paramInt4 += i4;
/* 1421 */         paramInt6 += i5;
/* 1422 */         paramInt9 += i8;
/* 1423 */         paramInt3 += j;
/* 1424 */         i9 += i11;
/* 1425 */         i12 += i14;
/* 1426 */         i15 += i17; }
/*      */       while (true) {
/* 1428 */         paramInt1--; if (paramInt1 < 0) break;
/* 1429 */         ca(n, arrayOfInt, 0, 0, paramInt3, paramInt5 >> 16, paramInt6 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1430 */         paramInt5 += i3;
/* 1431 */         paramInt6 += i5;
/* 1432 */         paramInt9 += i8;
/* 1433 */         paramInt3 += j;
/* 1434 */         i9 += i11;
/* 1435 */         i12 += i14;
/* 1436 */         i15 += i17;
/*      */       }
/* 1438 */       return;
/*      */     }
/*      */ 
/* 1441 */     paramInt1 -= paramInt2;
/* 1442 */     paramInt2 -= paramInt3;
/* 1443 */     paramInt3 = am[paramInt3];
/*      */     while (true) { paramInt2--; if (paramInt2 < 0) break;
/* 1445 */       ca(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt4 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1446 */       paramInt4 += i4;
/* 1447 */       paramInt6 += i5;
/* 1448 */       paramInt9 += i8;
/* 1449 */       paramInt3 += j;
/* 1450 */       i9 += i11;
/* 1451 */       i12 += i14;
/* 1452 */       i15 += i17; }
/*      */     while (true) {
/* 1454 */       paramInt1--; if (paramInt1 < 0) break;
/* 1455 */       ca(n, arrayOfInt, 0, 0, paramInt3, paramInt6 >> 16, paramInt5 >> 16, paramInt9, i7, i9, i12, i15, i10, i13, i16);
/* 1456 */       paramInt5 += i3;
/* 1457 */       paramInt6 += i5;
/* 1458 */       paramInt9 += i8;
/* 1459 */       paramInt3 += j;
/* 1460 */       i9 += i11;
/* 1461 */       i12 += i14;
/* 1462 */       i15 += i17;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void cm()
/*      */   {
/*   52 */     bn(i, g, s, q);
/*      */   }
/*      */ 
/*      */   static final void dq(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 1473 */     if (u) {
/* 1474 */       if (paramInt5 > x) paramInt5 = x;
/* 1475 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 1477 */     if (paramInt4 >= paramInt5) return;
/* 1478 */     paramInt3 += paramInt4;
/* 1479 */     paramInt6 += paramInt7 * paramInt4;
/* 1480 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 1481 */     if (w)
/*      */     {
/* 1487 */       i5 = paramInt4 - a;
/* 1488 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1489 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1490 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1491 */       i4 = paramInt10 >> 12;
/* 1492 */       if (i4 != 0) {
/* 1493 */         n = paramInt8 / i4;
/* 1494 */         i1 = paramInt9 / i4;
/* 1495 */         if (n < 0) n = 0;
/* 1496 */         else if (n > 4032) n = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1499 */         n = 0;
/* 1500 */         i1 = 0;
/*      */       }
/* 1502 */       paramInt8 += paramInt11;
/* 1503 */       paramInt9 += paramInt12;
/* 1504 */       paramInt10 += paramInt13;
/* 1505 */       i4 = paramInt10 >> 12;
/* 1506 */       if (i4 != 0) {
/* 1507 */         i2 = paramInt8 / i4;
/* 1508 */         i3 = paramInt9 / i4;
/* 1509 */         if (i2 < 0) i2 = 0;
/* 1510 */         else if (i2 > 4032) i2 = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1513 */         i2 = 0;
/* 1514 */         i3 = 0;
/*      */       }
/* 1516 */       paramInt1 = (n << 20) + i1;
/* 1517 */       j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1518 */       m >>= 3;
/* 1519 */       paramInt7 <<= 3;
/* 1520 */       i = paramInt6 >> 8;
/* 1521 */       if (v) {
/* 1522 */         if (m > 0) {
/*      */           do {
/* 1524 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1525 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1526 */             paramInt1 += j;
/* 1527 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1528 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1529 */             paramInt1 += j;
/* 1530 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1531 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1532 */             paramInt1 += j;
/* 1533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1535 */             paramInt1 += j;
/* 1536 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1537 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1538 */             paramInt1 += j;
/* 1539 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1540 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1541 */             paramInt1 += j;
/* 1542 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1543 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1544 */             paramInt1 += j;
/* 1545 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1546 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1547 */             paramInt1 += j;
/* 1548 */             n = i2;
/* 1549 */             i1 = i3;
/* 1550 */             paramInt8 += paramInt11;
/* 1551 */             paramInt9 += paramInt12;
/* 1552 */             paramInt10 += paramInt13;
/* 1553 */             i4 = paramInt10 >> 12;
/* 1554 */             if (i4 != 0) {
/* 1555 */               i2 = paramInt8 / i4;
/* 1556 */               i3 = paramInt9 / i4;
/* 1557 */               if (i2 < 0) i2 = 0;
/* 1558 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1561 */               i2 = 0;
/* 1562 */               i3 = 0;
/*      */             }
/* 1564 */             paramInt1 = (n << 20) + i1;
/* 1565 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1566 */             paramInt6 += paramInt7;
/* 1567 */             i = paramInt6 >> 8;
/* 1568 */             m--; } while (m > 0);
/*      */         }
/* 1570 */         m = paramInt5 - paramInt4 & 0x7;
/* 1571 */         if (m > 0)
/*      */           do {
/* 1573 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1574 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1575 */             paramInt1 += j;
/* 1576 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1580 */         if (m > 0) {
/*      */           do {
/* 1582 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1583 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1585 */             paramInt3++;
/* 1586 */             paramInt1 += j;
/* 1587 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1588 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1590 */             paramInt3++;
/* 1591 */             paramInt1 += j;
/* 1592 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1593 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1595 */             paramInt3++;
/* 1596 */             paramInt1 += j;
/* 1597 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1598 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1600 */             paramInt3++;
/* 1601 */             paramInt1 += j;
/* 1602 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1603 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1605 */             paramInt3++;
/* 1606 */             paramInt1 += j;
/* 1607 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1608 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1610 */             paramInt3++;
/* 1611 */             paramInt1 += j;
/* 1612 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1613 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1615 */             paramInt3++;
/* 1616 */             paramInt1 += j;
/* 1617 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1618 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1620 */             paramInt3++;
/* 1621 */             paramInt1 += j;
/* 1622 */             n = i2;
/* 1623 */             i1 = i3;
/* 1624 */             paramInt8 += paramInt11;
/* 1625 */             paramInt9 += paramInt12;
/* 1626 */             paramInt10 += paramInt13;
/* 1627 */             i4 = paramInt10 >> 12;
/* 1628 */             if (i4 != 0) {
/* 1629 */               i2 = paramInt8 / i4;
/* 1630 */               i3 = paramInt9 / i4;
/* 1631 */               if (i2 < 0) i2 = 0;
/* 1632 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1635 */               i2 = 0;
/* 1636 */               i3 = 0;
/*      */             }
/* 1638 */             paramInt1 = (n << 20) + i1;
/* 1639 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1640 */             paramInt6 += paramInt7;
/* 1641 */             i = paramInt6 >> 8;
/* 1642 */             m--; } while (m > 0);
/*      */         }
/* 1644 */         m = paramInt5 - paramInt4 & 0x7;
/* 1645 */         if (m > 0) {
/*      */           do {
/* 1647 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1648 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1650 */             paramInt3++;
/* 1651 */             paramInt1 += j;
/* 1652 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1662 */       i5 = paramInt4 - a;
/* 1663 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1664 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1665 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1666 */       i4 = paramInt10 >> 14;
/* 1667 */       if (i4 != 0) {
/* 1668 */         n = paramInt8 / i4;
/* 1669 */         i1 = paramInt9 / i4;
/* 1670 */         if (n < 0) n = 0;
/* 1671 */         else if (n > 16256) n = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1674 */         n = 0;
/* 1675 */         i1 = 0;
/*      */       }
/* 1677 */       paramInt8 += paramInt11;
/* 1678 */       paramInt9 += paramInt12;
/* 1679 */       paramInt10 += paramInt13;
/* 1680 */       i4 = paramInt10 >> 14;
/* 1681 */       if (i4 != 0) {
/* 1682 */         i2 = paramInt8 / i4;
/* 1683 */         i3 = paramInt9 / i4;
/* 1684 */         if (i2 < 0) i2 = 0;
/* 1685 */         else if (i2 > 16256) i2 = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1688 */         i2 = 0;
/* 1689 */         i3 = 0;
/*      */       }
/* 1691 */       paramInt1 = (n << 18) + i1;
/* 1692 */       j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1693 */       m >>= 3;
/* 1694 */       paramInt7 <<= 3;
/* 1695 */       i = paramInt6 >> 8;
/* 1696 */       if (v) {
/* 1697 */         if (m > 0) {
/*      */           do {
/* 1699 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1700 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1701 */             paramInt1 += j;
/* 1702 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1703 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1704 */             paramInt1 += j;
/* 1705 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1706 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1707 */             paramInt1 += j;
/* 1708 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1709 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1710 */             paramInt1 += j;
/* 1711 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1712 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1713 */             paramInt1 += j;
/* 1714 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1715 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1716 */             paramInt1 += j;
/* 1717 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1718 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1719 */             paramInt1 += j;
/* 1720 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1721 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1722 */             paramInt1 += j;
/* 1723 */             n = i2;
/* 1724 */             i1 = i3;
/* 1725 */             paramInt8 += paramInt11;
/* 1726 */             paramInt9 += paramInt12;
/* 1727 */             paramInt10 += paramInt13;
/* 1728 */             i4 = paramInt10 >> 14;
/* 1729 */             if (i4 != 0) {
/* 1730 */               i2 = paramInt8 / i4;
/* 1731 */               i3 = paramInt9 / i4;
/* 1732 */               if (i2 < 0) i2 = 0;
/* 1733 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1736 */               i2 = 0;
/* 1737 */               i3 = 0;
/*      */             }
/* 1739 */             paramInt1 = (n << 18) + i1;
/* 1740 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1741 */             paramInt6 += paramInt7;
/* 1742 */             i = paramInt6 >> 8;
/* 1743 */             m--; } while (m > 0);
/*      */         }
/* 1745 */         m = paramInt5 - paramInt4 & 0x7;
/* 1746 */         if (m > 0)
/*      */           do {
/* 1748 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1749 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1750 */             paramInt1 += j;
/* 1751 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1755 */         if (m > 0) {
/*      */           do {
/* 1757 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1758 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1760 */             paramInt3++;
/* 1761 */             paramInt1 += j;
/* 1762 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1763 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1765 */             paramInt3++;
/* 1766 */             paramInt1 += j;
/* 1767 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1768 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1770 */             paramInt3++;
/* 1771 */             paramInt1 += j;
/* 1772 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1773 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1775 */             paramInt3++;
/* 1776 */             paramInt1 += j;
/* 1777 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1778 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1780 */             paramInt3++;
/* 1781 */             paramInt1 += j;
/* 1782 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1783 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1785 */             paramInt3++;
/* 1786 */             paramInt1 += j;
/* 1787 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1788 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1790 */             paramInt3++;
/* 1791 */             paramInt1 += j;
/* 1792 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1793 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1795 */             paramInt3++;
/* 1796 */             paramInt1 += j;
/* 1797 */             n = i2;
/* 1798 */             i1 = i3;
/* 1799 */             paramInt8 += paramInt11;
/* 1800 */             paramInt9 += paramInt12;
/* 1801 */             paramInt10 += paramInt13;
/* 1802 */             i4 = paramInt10 >> 14;
/* 1803 */             if (i4 != 0) {
/* 1804 */               i2 = paramInt8 / i4;
/* 1805 */               i3 = paramInt9 / i4;
/* 1806 */               if (i2 < 0) i2 = 0;
/* 1807 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1810 */               i2 = 0;
/* 1811 */               i3 = 0;
/*      */             }
/* 1813 */             paramInt1 = (n << 18) + i1;
/* 1814 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1815 */             paramInt6 += paramInt7;
/* 1816 */             i = paramInt6 >> 8;
/* 1817 */             m--; } while (m > 0);
/*      */         }
/* 1819 */         m = paramInt5 - paramInt4 & 0x7;
/* 1820 */         if (m > 0)
/*      */           do {
/* 1822 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1823 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1825 */             paramInt3++;
/* 1826 */             paramInt1 += j;
/* 1827 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dj(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  536 */     if (u) {
/*  537 */       if (paramInt5 > x) paramInt5 = x;
/*  538 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/*  540 */     if (paramInt4 >= paramInt5) return;
/*  541 */     paramInt1 += paramInt4;
/*  542 */     paramInt6 += paramInt7 * paramInt4;
/*      */     int i;
/*      */     int j;
/*      */     int m;
/*  543 */     if (e) {
/*  544 */       paramInt3 = paramInt5 - paramInt4 >> 2;
/*  545 */       paramInt7 <<= 2;
/*  546 */       if (b == 0) {
/*  547 */         if (paramInt3 > 0) {
/*      */           do {
/*  549 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  550 */             paramInt6 += paramInt7;
/*  551 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  552 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  553 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  554 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  555 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  557 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  558 */         if (paramInt3 > 0) {
/*  559 */           paramInt2 = ap[(paramInt6 >> 8)];
/*      */           do {
/*  561 */             paramArrayOfInt[(paramInt1++)] = paramInt2;
/*  562 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*      */       else {
/*  566 */         i = b;
/*  567 */         j = 256 - b;
/*  568 */         if (paramInt3 > 0) {
/*      */           do {
/*  570 */             paramInt2 = ap[(paramInt6 >> 8)];
/*  571 */             paramInt6 += paramInt7;
/*  572 */             paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  573 */             m = paramArrayOfInt[paramInt1];
/*  574 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  575 */             m = paramArrayOfInt[paramInt1];
/*  576 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  577 */             m = paramArrayOfInt[paramInt1];
/*  578 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  579 */             m = paramArrayOfInt[paramInt1];
/*  580 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  581 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*  583 */         paramInt3 = paramInt5 - paramInt4 & 0x3;
/*  584 */         if (paramInt3 > 0) {
/*  585 */           paramInt2 = ap[(paramInt6 >> 8)];
/*  586 */           paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*      */           do {
/*  588 */             m = paramArrayOfInt[paramInt1];
/*  589 */             paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  590 */             paramInt3--; } while (paramInt3 > 0);
/*      */         }
/*      */       }
/*  593 */       return;
/*      */     }
/*      */ 
/*  596 */     paramInt3 = paramInt5 - paramInt4;
/*  597 */     if (b == 0) {
/*      */       do {
/*  599 */         paramArrayOfInt[(paramInt1++)] = ap[(paramInt6 >> 8)];
/*  600 */         paramInt6 += paramInt7;
/*  601 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */     else {
/*  604 */       i = b;
/*  605 */       j = 256 - b;
/*      */       do {
/*  607 */         paramInt2 = ap[(paramInt6 >> 8)];
/*  608 */         paramInt6 += paramInt7;
/*  609 */         paramInt2 = ((paramInt2 & 0xFF00FF) * j >> 8 & 0xFF00FF) + ((paramInt2 & 0xFF00) * j >> 8 & 0xFF00);
/*  610 */         m = paramArrayOfInt[paramInt1];
/*  611 */         paramArrayOfInt[(paramInt1++)] = (paramInt2 + ((m & 0xFF00FF) * i >> 8 & 0xFF00FF) + ((m & 0xFF00) * i >> 8 & 0xFF00));
/*  612 */         paramInt3--; } while (paramInt3 > 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   static int dd(int paramInt, double paramDouble)
/*      */   {
/*  155 */     double d1 = (paramInt >> 16) / 256.0D;
/*  156 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/*  157 */     double d3 = (paramInt & 0xFF) / 256.0D;
/*  158 */     d1 = Math.pow(d1, paramDouble);
/*  159 */     d2 = Math.pow(d2, paramDouble);
/*  160 */     d3 = Math.pow(d3, paramDouble);
/*  161 */     int i = (int)(d1 * 256.0D);
/*  162 */     int j = (int)(d2 * 256.0D);
/*  163 */     int m = (int)(d3 * 256.0D);
/*  164 */     return (i << 16) + (j << 8) + m;
/*      */   }
/*      */ 
/*      */   public static final void bm()
/*      */   {
/*   52 */     bn(i, g, s, q);
/*      */   }
/*      */ 
/*      */   static final void de(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 2316 */     if (u) {
/* 2317 */       if (paramInt5 > x) paramInt5 = x;
/* 2318 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 2320 */     if (paramInt4 >= paramInt5) return;
/* 2321 */     paramInt3 += paramInt4;
/* 2322 */     paramInt6 += paramInt7 * paramInt4;
/* 2323 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 2324 */     if (w)
/*      */     {
/* 2331 */       i5 = paramInt4 - a;
/* 2332 */       paramInt8 += paramInt11 * i5;
/* 2333 */       paramInt9 += paramInt12 * i5;
/* 2334 */       paramInt10 += paramInt13 * i5;
/* 2335 */       i4 = paramInt10 >> 12;
/* 2336 */       if (i4 != 0) {
/* 2337 */         n = paramInt8 / i4;
/* 2338 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2341 */         n = 0;
/* 2342 */         i1 = 0;
/*      */       }
/* 2344 */       paramInt8 += paramInt11 * m;
/* 2345 */       paramInt9 += paramInt12 * m;
/* 2346 */       paramInt10 += paramInt13 * m;
/* 2347 */       i4 = paramInt10 >> 12;
/* 2348 */       if (i4 != 0) {
/* 2349 */         i2 = paramInt8 / i4;
/* 2350 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2353 */         i2 = 0;
/* 2354 */         i3 = 0;
/*      */       }
/* 2356 */       paramInt1 = (n << 20) + i1;
/* 2357 */       j = ((i2 - n) / m << 20) + (i3 - i1) / m;
/* 2358 */       m >>= 3;
/* 2359 */       paramInt7 <<= 3;
/* 2360 */       i = paramInt6 >> 8;
/*      */ 
/* 2362 */       if (v) {
/* 2363 */         if (m > 0) {
/*      */           do {
/* 2365 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2366 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2367 */             paramInt1 += j;
/* 2368 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2369 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2370 */             paramInt1 += j;
/* 2371 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2372 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2373 */             paramInt1 += j;
/* 2374 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2375 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2376 */             paramInt1 += j;
/* 2377 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2378 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2379 */             paramInt1 += j;
/* 2380 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2381 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2382 */             paramInt1 += j;
/* 2383 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2384 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2385 */             paramInt1 += j;
/* 2386 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2387 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2388 */             paramInt1 += j;
/* 2389 */             paramInt6 += paramInt7;
/* 2390 */             i = paramInt6 >> 8;
/* 2391 */             m--; } while (m > 0);
/*      */         }
/* 2393 */         m = paramInt5 - paramInt4 & 0x7;
/* 2394 */         if (m > 0)
/*      */           do {
/* 2396 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2397 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2398 */             paramInt1 += j;
/* 2399 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2403 */         if (m > 0) {
/*      */           do {
/* 2405 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2406 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2408 */             paramInt3++;
/* 2409 */             paramInt1 += j;
/* 2410 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2411 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2413 */             paramInt3++;
/* 2414 */             paramInt1 += j;
/* 2415 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2416 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2418 */             paramInt3++;
/* 2419 */             paramInt1 += j;
/* 2420 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2421 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2423 */             paramInt3++;
/* 2424 */             paramInt1 += j;
/* 2425 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2426 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2428 */             paramInt3++;
/* 2429 */             paramInt1 += j;
/* 2430 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2431 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2433 */             paramInt3++;
/* 2434 */             paramInt1 += j;
/* 2435 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2436 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2438 */             paramInt3++;
/* 2439 */             paramInt1 += j;
/* 2440 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2441 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2443 */             paramInt3++;
/* 2444 */             paramInt1 += j;
/* 2445 */             paramInt6 += paramInt7;
/* 2446 */             i = paramInt6 >> 8;
/* 2447 */             m--; } while (m > 0);
/*      */         }
/* 2449 */         m = paramInt5 - paramInt4 & 0x7;
/* 2450 */         if (m > 0) {
/*      */           do {
/* 2452 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2453 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2455 */             paramInt3++;
/* 2456 */             paramInt1 += j;
/* 2457 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 2468 */       i5 = paramInt4 - a;
/* 2469 */       paramInt8 += paramInt11 * i5;
/* 2470 */       paramInt9 += paramInt12 * i5;
/* 2471 */       paramInt10 += paramInt13 * i5;
/* 2472 */       i4 = paramInt10 >> 14;
/* 2473 */       if (i4 != 0) {
/* 2474 */         n = paramInt8 / i4;
/* 2475 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2478 */         n = 0;
/* 2479 */         i1 = 0;
/*      */       }
/* 2481 */       paramInt8 += paramInt11 * m;
/* 2482 */       paramInt9 += paramInt12 * m;
/* 2483 */       paramInt10 += paramInt13 * m;
/* 2484 */       i4 = paramInt10 >> 14;
/* 2485 */       if (i4 != 0) {
/* 2486 */         i2 = paramInt8 / i4;
/* 2487 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2490 */         i2 = 0;
/* 2491 */         i3 = 0;
/*      */       }
/* 2493 */       paramInt1 = (n << 18) + i1;
/* 2494 */       j = ((i2 - n) / m << 18) + (i3 - i1) / m;
/* 2495 */       m >>= 3;
/* 2496 */       paramInt7 <<= 3;
/* 2497 */       i = paramInt6 >> 8;
/*      */ 
/* 2499 */       if (v) {
/* 2500 */         if (m > 0) {
/*      */           do {
/* 2502 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2503 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2504 */             paramInt1 += j;
/* 2505 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2506 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2507 */             paramInt1 += j;
/* 2508 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2509 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2510 */             paramInt1 += j;
/* 2511 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2512 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2513 */             paramInt1 += j;
/* 2514 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2515 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2516 */             paramInt1 += j;
/* 2517 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2518 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2519 */             paramInt1 += j;
/* 2520 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2521 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2522 */             paramInt1 += j;
/* 2523 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2524 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2525 */             paramInt1 += j;
/* 2526 */             paramInt6 += paramInt7;
/* 2527 */             i = paramInt6 >> 8;
/* 2528 */             m--; } while (m > 0);
/*      */         }
/* 2530 */         m = paramInt5 - paramInt4 & 0x7;
/* 2531 */         if (m > 0)
/*      */           do {
/* 2533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2535 */             paramInt1 += j;
/* 2536 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2540 */         if (m > 0) {
/*      */           do {
/* 2542 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2543 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2545 */             paramInt3++;
/* 2546 */             paramInt1 += j;
/* 2547 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2548 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2550 */             paramInt3++;
/* 2551 */             paramInt1 += j;
/* 2552 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2553 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2555 */             paramInt3++;
/* 2556 */             paramInt1 += j;
/* 2557 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2558 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2560 */             paramInt3++;
/* 2561 */             paramInt1 += j;
/* 2562 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2563 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2565 */             paramInt3++;
/* 2566 */             paramInt1 += j;
/* 2567 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2568 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2570 */             paramInt3++;
/* 2571 */             paramInt1 += j;
/* 2572 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2573 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2575 */             paramInt3++;
/* 2576 */             paramInt1 += j;
/* 2577 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2578 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2580 */             paramInt3++;
/* 2581 */             paramInt1 += j;
/* 2582 */             paramInt6 += paramInt7;
/* 2583 */             i = paramInt6 >> 8;
/* 2584 */             m--; } while (m > 0);
/*      */         }
/* 2586 */         m = paramInt5 - paramInt4 & 0x7;
/* 2587 */         if (m > 0)
/*      */           do {
/* 2589 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2590 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2592 */             paramInt3++;
/* 2593 */             paramInt1 += j;
/* 2594 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dw(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 2316 */     if (u) {
/* 2317 */       if (paramInt5 > x) paramInt5 = x;
/* 2318 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 2320 */     if (paramInt4 >= paramInt5) return;
/* 2321 */     paramInt3 += paramInt4;
/* 2322 */     paramInt6 += paramInt7 * paramInt4;
/* 2323 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 2324 */     if (w)
/*      */     {
/* 2331 */       i5 = paramInt4 - a;
/* 2332 */       paramInt8 += paramInt11 * i5;
/* 2333 */       paramInt9 += paramInt12 * i5;
/* 2334 */       paramInt10 += paramInt13 * i5;
/* 2335 */       i4 = paramInt10 >> 12;
/* 2336 */       if (i4 != 0) {
/* 2337 */         n = paramInt8 / i4;
/* 2338 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2341 */         n = 0;
/* 2342 */         i1 = 0;
/*      */       }
/* 2344 */       paramInt8 += paramInt11 * m;
/* 2345 */       paramInt9 += paramInt12 * m;
/* 2346 */       paramInt10 += paramInt13 * m;
/* 2347 */       i4 = paramInt10 >> 12;
/* 2348 */       if (i4 != 0) {
/* 2349 */         i2 = paramInt8 / i4;
/* 2350 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2353 */         i2 = 0;
/* 2354 */         i3 = 0;
/*      */       }
/* 2356 */       paramInt1 = (n << 20) + i1;
/* 2357 */       j = ((i2 - n) / m << 20) + (i3 - i1) / m;
/* 2358 */       m >>= 3;
/* 2359 */       paramInt7 <<= 3;
/* 2360 */       i = paramInt6 >> 8;
/*      */ 
/* 2362 */       if (v) {
/* 2363 */         if (m > 0) {
/*      */           do {
/* 2365 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2366 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2367 */             paramInt1 += j;
/* 2368 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2369 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2370 */             paramInt1 += j;
/* 2371 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2372 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2373 */             paramInt1 += j;
/* 2374 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2375 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2376 */             paramInt1 += j;
/* 2377 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2378 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2379 */             paramInt1 += j;
/* 2380 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2381 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2382 */             paramInt1 += j;
/* 2383 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2384 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2385 */             paramInt1 += j;
/* 2386 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2387 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2388 */             paramInt1 += j;
/* 2389 */             paramInt6 += paramInt7;
/* 2390 */             i = paramInt6 >> 8;
/* 2391 */             m--; } while (m > 0);
/*      */         }
/* 2393 */         m = paramInt5 - paramInt4 & 0x7;
/* 2394 */         if (m > 0)
/*      */           do {
/* 2396 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 2397 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2398 */             paramInt1 += j;
/* 2399 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2403 */         if (m > 0) {
/*      */           do {
/* 2405 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2406 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2408 */             paramInt3++;
/* 2409 */             paramInt1 += j;
/* 2410 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2411 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2413 */             paramInt3++;
/* 2414 */             paramInt1 += j;
/* 2415 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2416 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2418 */             paramInt3++;
/* 2419 */             paramInt1 += j;
/* 2420 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2421 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2423 */             paramInt3++;
/* 2424 */             paramInt1 += j;
/* 2425 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2426 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2428 */             paramInt3++;
/* 2429 */             paramInt1 += j;
/* 2430 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2431 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2433 */             paramInt3++;
/* 2434 */             paramInt1 += j;
/* 2435 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2436 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2438 */             paramInt3++;
/* 2439 */             paramInt1 += j;
/* 2440 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2441 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2443 */             paramInt3++;
/* 2444 */             paramInt1 += j;
/* 2445 */             paramInt6 += paramInt7;
/* 2446 */             i = paramInt6 >> 8;
/* 2447 */             m--; } while (m > 0);
/*      */         }
/* 2449 */         m = paramInt5 - paramInt4 & 0x7;
/* 2450 */         if (m > 0) {
/*      */           do {
/* 2452 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 2453 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2455 */             paramInt3++;
/* 2456 */             paramInt1 += j;
/* 2457 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 2468 */       i5 = paramInt4 - a;
/* 2469 */       paramInt8 += paramInt11 * i5;
/* 2470 */       paramInt9 += paramInt12 * i5;
/* 2471 */       paramInt10 += paramInt13 * i5;
/* 2472 */       i4 = paramInt10 >> 14;
/* 2473 */       if (i4 != 0) {
/* 2474 */         n = paramInt8 / i4;
/* 2475 */         i1 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2478 */         n = 0;
/* 2479 */         i1 = 0;
/*      */       }
/* 2481 */       paramInt8 += paramInt11 * m;
/* 2482 */       paramInt9 += paramInt12 * m;
/* 2483 */       paramInt10 += paramInt13 * m;
/* 2484 */       i4 = paramInt10 >> 14;
/* 2485 */       if (i4 != 0) {
/* 2486 */         i2 = paramInt8 / i4;
/* 2487 */         i3 = paramInt9 / i4;
/*      */       }
/*      */       else {
/* 2490 */         i2 = 0;
/* 2491 */         i3 = 0;
/*      */       }
/* 2493 */       paramInt1 = (n << 18) + i1;
/* 2494 */       j = ((i2 - n) / m << 18) + (i3 - i1) / m;
/* 2495 */       m >>= 3;
/* 2496 */       paramInt7 <<= 3;
/* 2497 */       i = paramInt6 >> 8;
/*      */ 
/* 2499 */       if (v) {
/* 2500 */         if (m > 0) {
/*      */           do {
/* 2502 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2503 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2504 */             paramInt1 += j;
/* 2505 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2506 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2507 */             paramInt1 += j;
/* 2508 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2509 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2510 */             paramInt1 += j;
/* 2511 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2512 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2513 */             paramInt1 += j;
/* 2514 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2515 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2516 */             paramInt1 += j;
/* 2517 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2518 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2519 */             paramInt1 += j;
/* 2520 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2521 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2522 */             paramInt1 += j;
/* 2523 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2524 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2525 */             paramInt1 += j;
/* 2526 */             paramInt6 += paramInt7;
/* 2527 */             i = paramInt6 >> 8;
/* 2528 */             m--; } while (m > 0);
/*      */         }
/* 2530 */         m = paramInt5 - paramInt4 & 0x7;
/* 2531 */         if (m > 0)
/*      */           do {
/* 2533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 2534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 2535 */             paramInt1 += j;
/* 2536 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 2540 */         if (m > 0) {
/*      */           do {
/* 2542 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2543 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2545 */             paramInt3++;
/* 2546 */             paramInt1 += j;
/* 2547 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2548 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2550 */             paramInt3++;
/* 2551 */             paramInt1 += j;
/* 2552 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2553 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2555 */             paramInt3++;
/* 2556 */             paramInt1 += j;
/* 2557 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2558 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2560 */             paramInt3++;
/* 2561 */             paramInt1 += j;
/* 2562 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2563 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2565 */             paramInt3++;
/* 2566 */             paramInt1 += j;
/* 2567 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2568 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2570 */             paramInt3++;
/* 2571 */             paramInt1 += j;
/* 2572 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2573 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2575 */             paramInt3++;
/* 2576 */             paramInt1 += j;
/* 2577 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2578 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2580 */             paramInt3++;
/* 2581 */             paramInt1 += j;
/* 2582 */             paramInt6 += paramInt7;
/* 2583 */             i = paramInt6 >> 8;
/* 2584 */             m--; } while (m > 0);
/*      */         }
/* 2586 */         m = paramInt5 - paramInt4 & 0x7;
/* 2587 */         if (m > 0)
/*      */           do {
/* 2589 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 2590 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 2592 */             paramInt3++;
/* 2593 */             paramInt1 += j;
/* 2594 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void db(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 1473 */     if (u) {
/* 1474 */       if (paramInt5 > x) paramInt5 = x;
/* 1475 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 1477 */     if (paramInt4 >= paramInt5) return;
/* 1478 */     paramInt3 += paramInt4;
/* 1479 */     paramInt6 += paramInt7 * paramInt4;
/* 1480 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 1481 */     if (w)
/*      */     {
/* 1487 */       i5 = paramInt4 - a;
/* 1488 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1489 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1490 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1491 */       i4 = paramInt10 >> 12;
/* 1492 */       if (i4 != 0) {
/* 1493 */         n = paramInt8 / i4;
/* 1494 */         i1 = paramInt9 / i4;
/* 1495 */         if (n < 0) n = 0;
/* 1496 */         else if (n > 4032) n = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1499 */         n = 0;
/* 1500 */         i1 = 0;
/*      */       }
/* 1502 */       paramInt8 += paramInt11;
/* 1503 */       paramInt9 += paramInt12;
/* 1504 */       paramInt10 += paramInt13;
/* 1505 */       i4 = paramInt10 >> 12;
/* 1506 */       if (i4 != 0) {
/* 1507 */         i2 = paramInt8 / i4;
/* 1508 */         i3 = paramInt9 / i4;
/* 1509 */         if (i2 < 0) i2 = 0;
/* 1510 */         else if (i2 > 4032) i2 = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1513 */         i2 = 0;
/* 1514 */         i3 = 0;
/*      */       }
/* 1516 */       paramInt1 = (n << 20) + i1;
/* 1517 */       j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1518 */       m >>= 3;
/* 1519 */       paramInt7 <<= 3;
/* 1520 */       i = paramInt6 >> 8;
/* 1521 */       if (v) {
/* 1522 */         if (m > 0) {
/*      */           do {
/* 1524 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1525 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1526 */             paramInt1 += j;
/* 1527 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1528 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1529 */             paramInt1 += j;
/* 1530 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1531 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1532 */             paramInt1 += j;
/* 1533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1535 */             paramInt1 += j;
/* 1536 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1537 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1538 */             paramInt1 += j;
/* 1539 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1540 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1541 */             paramInt1 += j;
/* 1542 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1543 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1544 */             paramInt1 += j;
/* 1545 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1546 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1547 */             paramInt1 += j;
/* 1548 */             n = i2;
/* 1549 */             i1 = i3;
/* 1550 */             paramInt8 += paramInt11;
/* 1551 */             paramInt9 += paramInt12;
/* 1552 */             paramInt10 += paramInt13;
/* 1553 */             i4 = paramInt10 >> 12;
/* 1554 */             if (i4 != 0) {
/* 1555 */               i2 = paramInt8 / i4;
/* 1556 */               i3 = paramInt9 / i4;
/* 1557 */               if (i2 < 0) i2 = 0;
/* 1558 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1561 */               i2 = 0;
/* 1562 */               i3 = 0;
/*      */             }
/* 1564 */             paramInt1 = (n << 20) + i1;
/* 1565 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1566 */             paramInt6 += paramInt7;
/* 1567 */             i = paramInt6 >> 8;
/* 1568 */             m--; } while (m > 0);
/*      */         }
/* 1570 */         m = paramInt5 - paramInt4 & 0x7;
/* 1571 */         if (m > 0)
/*      */           do {
/* 1573 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1574 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1575 */             paramInt1 += j;
/* 1576 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1580 */         if (m > 0) {
/*      */           do {
/* 1582 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1583 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1585 */             paramInt3++;
/* 1586 */             paramInt1 += j;
/* 1587 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1588 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1590 */             paramInt3++;
/* 1591 */             paramInt1 += j;
/* 1592 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1593 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1595 */             paramInt3++;
/* 1596 */             paramInt1 += j;
/* 1597 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1598 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1600 */             paramInt3++;
/* 1601 */             paramInt1 += j;
/* 1602 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1603 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1605 */             paramInt3++;
/* 1606 */             paramInt1 += j;
/* 1607 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1608 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1610 */             paramInt3++;
/* 1611 */             paramInt1 += j;
/* 1612 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1613 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1615 */             paramInt3++;
/* 1616 */             paramInt1 += j;
/* 1617 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1618 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1620 */             paramInt3++;
/* 1621 */             paramInt1 += j;
/* 1622 */             n = i2;
/* 1623 */             i1 = i3;
/* 1624 */             paramInt8 += paramInt11;
/* 1625 */             paramInt9 += paramInt12;
/* 1626 */             paramInt10 += paramInt13;
/* 1627 */             i4 = paramInt10 >> 12;
/* 1628 */             if (i4 != 0) {
/* 1629 */               i2 = paramInt8 / i4;
/* 1630 */               i3 = paramInt9 / i4;
/* 1631 */               if (i2 < 0) i2 = 0;
/* 1632 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1635 */               i2 = 0;
/* 1636 */               i3 = 0;
/*      */             }
/* 1638 */             paramInt1 = (n << 20) + i1;
/* 1639 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1640 */             paramInt6 += paramInt7;
/* 1641 */             i = paramInt6 >> 8;
/* 1642 */             m--; } while (m > 0);
/*      */         }
/* 1644 */         m = paramInt5 - paramInt4 & 0x7;
/* 1645 */         if (m > 0) {
/*      */           do {
/* 1647 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1648 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1650 */             paramInt3++;
/* 1651 */             paramInt1 += j;
/* 1652 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1662 */       i5 = paramInt4 - a;
/* 1663 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1664 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1665 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1666 */       i4 = paramInt10 >> 14;
/* 1667 */       if (i4 != 0) {
/* 1668 */         n = paramInt8 / i4;
/* 1669 */         i1 = paramInt9 / i4;
/* 1670 */         if (n < 0) n = 0;
/* 1671 */         else if (n > 16256) n = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1674 */         n = 0;
/* 1675 */         i1 = 0;
/*      */       }
/* 1677 */       paramInt8 += paramInt11;
/* 1678 */       paramInt9 += paramInt12;
/* 1679 */       paramInt10 += paramInt13;
/* 1680 */       i4 = paramInt10 >> 14;
/* 1681 */       if (i4 != 0) {
/* 1682 */         i2 = paramInt8 / i4;
/* 1683 */         i3 = paramInt9 / i4;
/* 1684 */         if (i2 < 0) i2 = 0;
/* 1685 */         else if (i2 > 16256) i2 = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1688 */         i2 = 0;
/* 1689 */         i3 = 0;
/*      */       }
/* 1691 */       paramInt1 = (n << 18) + i1;
/* 1692 */       j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1693 */       m >>= 3;
/* 1694 */       paramInt7 <<= 3;
/* 1695 */       i = paramInt6 >> 8;
/* 1696 */       if (v) {
/* 1697 */         if (m > 0) {
/*      */           do {
/* 1699 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1700 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1701 */             paramInt1 += j;
/* 1702 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1703 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1704 */             paramInt1 += j;
/* 1705 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1706 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1707 */             paramInt1 += j;
/* 1708 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1709 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1710 */             paramInt1 += j;
/* 1711 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1712 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1713 */             paramInt1 += j;
/* 1714 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1715 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1716 */             paramInt1 += j;
/* 1717 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1718 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1719 */             paramInt1 += j;
/* 1720 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1721 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1722 */             paramInt1 += j;
/* 1723 */             n = i2;
/* 1724 */             i1 = i3;
/* 1725 */             paramInt8 += paramInt11;
/* 1726 */             paramInt9 += paramInt12;
/* 1727 */             paramInt10 += paramInt13;
/* 1728 */             i4 = paramInt10 >> 14;
/* 1729 */             if (i4 != 0) {
/* 1730 */               i2 = paramInt8 / i4;
/* 1731 */               i3 = paramInt9 / i4;
/* 1732 */               if (i2 < 0) i2 = 0;
/* 1733 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1736 */               i2 = 0;
/* 1737 */               i3 = 0;
/*      */             }
/* 1739 */             paramInt1 = (n << 18) + i1;
/* 1740 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1741 */             paramInt6 += paramInt7;
/* 1742 */             i = paramInt6 >> 8;
/* 1743 */             m--; } while (m > 0);
/*      */         }
/* 1745 */         m = paramInt5 - paramInt4 & 0x7;
/* 1746 */         if (m > 0)
/*      */           do {
/* 1748 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1749 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1750 */             paramInt1 += j;
/* 1751 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1755 */         if (m > 0) {
/*      */           do {
/* 1757 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1758 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1760 */             paramInt3++;
/* 1761 */             paramInt1 += j;
/* 1762 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1763 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1765 */             paramInt3++;
/* 1766 */             paramInt1 += j;
/* 1767 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1768 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1770 */             paramInt3++;
/* 1771 */             paramInt1 += j;
/* 1772 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1773 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1775 */             paramInt3++;
/* 1776 */             paramInt1 += j;
/* 1777 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1778 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1780 */             paramInt3++;
/* 1781 */             paramInt1 += j;
/* 1782 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1783 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1785 */             paramInt3++;
/* 1786 */             paramInt1 += j;
/* 1787 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1788 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1790 */             paramInt3++;
/* 1791 */             paramInt1 += j;
/* 1792 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1793 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1795 */             paramInt3++;
/* 1796 */             paramInt1 += j;
/* 1797 */             n = i2;
/* 1798 */             i1 = i3;
/* 1799 */             paramInt8 += paramInt11;
/* 1800 */             paramInt9 += paramInt12;
/* 1801 */             paramInt10 += paramInt13;
/* 1802 */             i4 = paramInt10 >> 14;
/* 1803 */             if (i4 != 0) {
/* 1804 */               i2 = paramInt8 / i4;
/* 1805 */               i3 = paramInt9 / i4;
/* 1806 */               if (i2 < 0) i2 = 0;
/* 1807 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1810 */               i2 = 0;
/* 1811 */               i3 = 0;
/*      */             }
/* 1813 */             paramInt1 = (n << 18) + i1;
/* 1814 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1815 */             paramInt6 += paramInt7;
/* 1816 */             i = paramInt6 >> 8;
/* 1817 */             m--; } while (m > 0);
/*      */         }
/* 1819 */         m = paramInt5 - paramInt4 & 0x7;
/* 1820 */         if (m > 0)
/*      */           do {
/* 1822 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1823 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1825 */             paramInt3++;
/* 1826 */             paramInt1 += j;
/* 1827 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dr(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/* 1473 */     if (u) {
/* 1474 */       if (paramInt5 > x) paramInt5 = x;
/* 1475 */       if (paramInt4 < 0) paramInt4 = 0;
/*      */     }
/* 1477 */     if (paramInt4 >= paramInt5) return;
/* 1478 */     paramInt3 += paramInt4;
/* 1479 */     paramInt6 += paramInt7 * paramInt4;
/* 1480 */     int m = paramInt5 - paramInt4;
/*      */     int i5;
/*      */     int i4;
/*      */     int n;
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int j;
/*      */     int i;
/* 1481 */     if (w)
/*      */     {
/* 1487 */       i5 = paramInt4 - a;
/* 1488 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1489 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1490 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1491 */       i4 = paramInt10 >> 12;
/* 1492 */       if (i4 != 0) {
/* 1493 */         n = paramInt8 / i4;
/* 1494 */         i1 = paramInt9 / i4;
/* 1495 */         if (n < 0) n = 0;
/* 1496 */         else if (n > 4032) n = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1499 */         n = 0;
/* 1500 */         i1 = 0;
/*      */       }
/* 1502 */       paramInt8 += paramInt11;
/* 1503 */       paramInt9 += paramInt12;
/* 1504 */       paramInt10 += paramInt13;
/* 1505 */       i4 = paramInt10 >> 12;
/* 1506 */       if (i4 != 0) {
/* 1507 */         i2 = paramInt8 / i4;
/* 1508 */         i3 = paramInt9 / i4;
/* 1509 */         if (i2 < 0) i2 = 0;
/* 1510 */         else if (i2 > 4032) i2 = 4032; 
/*      */       }
/*      */       else
/*      */       {
/* 1513 */         i2 = 0;
/* 1514 */         i3 = 0;
/*      */       }
/* 1516 */       paramInt1 = (n << 20) + i1;
/* 1517 */       j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1518 */       m >>= 3;
/* 1519 */       paramInt7 <<= 3;
/* 1520 */       i = paramInt6 >> 8;
/* 1521 */       if (v) {
/* 1522 */         if (m > 0) {
/*      */           do {
/* 1524 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1525 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1526 */             paramInt1 += j;
/* 1527 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1528 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1529 */             paramInt1 += j;
/* 1530 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1531 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1532 */             paramInt1 += j;
/* 1533 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1534 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1535 */             paramInt1 += j;
/* 1536 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1537 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1538 */             paramInt1 += j;
/* 1539 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1540 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1541 */             paramInt1 += j;
/* 1542 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1543 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1544 */             paramInt1 += j;
/* 1545 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1546 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1547 */             paramInt1 += j;
/* 1548 */             n = i2;
/* 1549 */             i1 = i3;
/* 1550 */             paramInt8 += paramInt11;
/* 1551 */             paramInt9 += paramInt12;
/* 1552 */             paramInt10 += paramInt13;
/* 1553 */             i4 = paramInt10 >> 12;
/* 1554 */             if (i4 != 0) {
/* 1555 */               i2 = paramInt8 / i4;
/* 1556 */               i3 = paramInt9 / i4;
/* 1557 */               if (i2 < 0) i2 = 0;
/* 1558 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1561 */               i2 = 0;
/* 1562 */               i3 = 0;
/*      */             }
/* 1564 */             paramInt1 = (n << 20) + i1;
/* 1565 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1566 */             paramInt6 += paramInt7;
/* 1567 */             i = paramInt6 >> 8;
/* 1568 */             m--; } while (m > 0);
/*      */         }
/* 1570 */         m = paramInt5 - paramInt4 & 0x7;
/* 1571 */         if (m > 0)
/*      */           do {
/* 1573 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))];
/* 1574 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1575 */             paramInt1 += j;
/* 1576 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1580 */         if (m > 0) {
/*      */           do {
/* 1582 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1583 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1585 */             paramInt3++;
/* 1586 */             paramInt1 += j;
/* 1587 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1588 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1590 */             paramInt3++;
/* 1591 */             paramInt1 += j;
/* 1592 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1593 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1595 */             paramInt3++;
/* 1596 */             paramInt1 += j;
/* 1597 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1598 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1600 */             paramInt3++;
/* 1601 */             paramInt1 += j;
/* 1602 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1603 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1605 */             paramInt3++;
/* 1606 */             paramInt1 += j;
/* 1607 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1608 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1610 */             paramInt3++;
/* 1611 */             paramInt1 += j;
/* 1612 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1613 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1615 */             paramInt3++;
/* 1616 */             paramInt1 += j;
/* 1617 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1618 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1620 */             paramInt3++;
/* 1621 */             paramInt1 += j;
/* 1622 */             n = i2;
/* 1623 */             i1 = i3;
/* 1624 */             paramInt8 += paramInt11;
/* 1625 */             paramInt9 += paramInt12;
/* 1626 */             paramInt10 += paramInt13;
/* 1627 */             i4 = paramInt10 >> 12;
/* 1628 */             if (i4 != 0) {
/* 1629 */               i2 = paramInt8 / i4;
/* 1630 */               i3 = paramInt9 / i4;
/* 1631 */               if (i2 < 0) i2 = 0;
/* 1632 */               else if (i2 > 4032) i2 = 4032; 
/*      */             }
/*      */             else
/*      */             {
/* 1635 */               i2 = 0;
/* 1636 */               i3 = 0;
/*      */             }
/* 1638 */             paramInt1 = (n << 20) + i1;
/* 1639 */             j = (i2 - n >> 3 << 20) + (i3 - i1 >> 3);
/* 1640 */             paramInt6 += paramInt7;
/* 1641 */             i = paramInt6 >> 8;
/* 1642 */             m--; } while (m > 0);
/*      */         }
/* 1644 */         m = paramInt5 - paramInt4 & 0x7;
/* 1645 */         if (m > 0) {
/*      */           do {
/* 1647 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0xFC0) + (paramInt1 >>> 26))]) != 0) {
/* 1648 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1650 */             paramInt3++;
/* 1651 */             paramInt1 += j;
/* 1652 */             m--; } while (m > 0);
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1662 */       i5 = paramInt4 - a;
/* 1663 */       paramInt8 += (paramInt11 >> 3) * i5;
/* 1664 */       paramInt9 += (paramInt12 >> 3) * i5;
/* 1665 */       paramInt10 += (paramInt13 >> 3) * i5;
/* 1666 */       i4 = paramInt10 >> 14;
/* 1667 */       if (i4 != 0) {
/* 1668 */         n = paramInt8 / i4;
/* 1669 */         i1 = paramInt9 / i4;
/* 1670 */         if (n < 0) n = 0;
/* 1671 */         else if (n > 16256) n = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1674 */         n = 0;
/* 1675 */         i1 = 0;
/*      */       }
/* 1677 */       paramInt8 += paramInt11;
/* 1678 */       paramInt9 += paramInt12;
/* 1679 */       paramInt10 += paramInt13;
/* 1680 */       i4 = paramInt10 >> 14;
/* 1681 */       if (i4 != 0) {
/* 1682 */         i2 = paramInt8 / i4;
/* 1683 */         i3 = paramInt9 / i4;
/* 1684 */         if (i2 < 0) i2 = 0;
/* 1685 */         else if (i2 > 16256) i2 = 16256; 
/*      */       }
/*      */       else
/*      */       {
/* 1688 */         i2 = 0;
/* 1689 */         i3 = 0;
/*      */       }
/* 1691 */       paramInt1 = (n << 18) + i1;
/* 1692 */       j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1693 */       m >>= 3;
/* 1694 */       paramInt7 <<= 3;
/* 1695 */       i = paramInt6 >> 8;
/* 1696 */       if (v) {
/* 1697 */         if (m > 0) {
/*      */           do {
/* 1699 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1700 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1701 */             paramInt1 += j;
/* 1702 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1703 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1704 */             paramInt1 += j;
/* 1705 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1706 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1707 */             paramInt1 += j;
/* 1708 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1709 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1710 */             paramInt1 += j;
/* 1711 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1712 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1713 */             paramInt1 += j;
/* 1714 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1715 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1716 */             paramInt1 += j;
/* 1717 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1718 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1719 */             paramInt1 += j;
/* 1720 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1721 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1722 */             paramInt1 += j;
/* 1723 */             n = i2;
/* 1724 */             i1 = i3;
/* 1725 */             paramInt8 += paramInt11;
/* 1726 */             paramInt9 += paramInt12;
/* 1727 */             paramInt10 += paramInt13;
/* 1728 */             i4 = paramInt10 >> 14;
/* 1729 */             if (i4 != 0) {
/* 1730 */               i2 = paramInt8 / i4;
/* 1731 */               i3 = paramInt9 / i4;
/* 1732 */               if (i2 < 0) i2 = 0;
/* 1733 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1736 */               i2 = 0;
/* 1737 */               i3 = 0;
/*      */             }
/* 1739 */             paramInt1 = (n << 18) + i1;
/* 1740 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1741 */             paramInt6 += paramInt7;
/* 1742 */             i = paramInt6 >> 8;
/* 1743 */             m--; } while (m > 0);
/*      */         }
/* 1745 */         m = paramInt5 - paramInt4 & 0x7;
/* 1746 */         if (m > 0)
/*      */           do {
/* 1748 */             paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))];
/* 1749 */             paramArrayOfInt1[(paramInt3++)] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/* 1750 */             paramInt1 += j;
/* 1751 */             m--; } while (m > 0);
/*      */       }
/*      */       else
/*      */       {
/* 1755 */         if (m > 0) {
/*      */           do {
/* 1757 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1758 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1760 */             paramInt3++;
/* 1761 */             paramInt1 += j;
/* 1762 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1763 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1765 */             paramInt3++;
/* 1766 */             paramInt1 += j;
/* 1767 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1768 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1770 */             paramInt3++;
/* 1771 */             paramInt1 += j;
/* 1772 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1773 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1775 */             paramInt3++;
/* 1776 */             paramInt1 += j;
/* 1777 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1778 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1780 */             paramInt3++;
/* 1781 */             paramInt1 += j;
/* 1782 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1783 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1785 */             paramInt3++;
/* 1786 */             paramInt1 += j;
/* 1787 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1788 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1790 */             paramInt3++;
/* 1791 */             paramInt1 += j;
/* 1792 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1793 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1795 */             paramInt3++;
/* 1796 */             paramInt1 += j;
/* 1797 */             n = i2;
/* 1798 */             i1 = i3;
/* 1799 */             paramInt8 += paramInt11;
/* 1800 */             paramInt9 += paramInt12;
/* 1801 */             paramInt10 += paramInt13;
/* 1802 */             i4 = paramInt10 >> 14;
/* 1803 */             if (i4 != 0) {
/* 1804 */               i2 = paramInt8 / i4;
/* 1805 */               i3 = paramInt9 / i4;
/* 1806 */               if (i2 < 0) i2 = 0;
/* 1807 */               else if (i2 > 16256) i2 = 16256; 
/*      */             }
/*      */             else
/*      */             {
/* 1810 */               i2 = 0;
/* 1811 */               i3 = 0;
/*      */             }
/* 1813 */             paramInt1 = (n << 18) + i1;
/* 1814 */             j = (i2 - n >> 3 << 18) + (i3 - i1 >> 3);
/* 1815 */             paramInt6 += paramInt7;
/* 1816 */             i = paramInt6 >> 8;
/* 1817 */             m--; } while (m > 0);
/*      */         }
/* 1819 */         m = paramInt5 - paramInt4 & 0x7;
/* 1820 */         if (m > 0)
/*      */           do {
/* 1822 */             if ((paramInt2 = paramArrayOfInt2[((paramInt1 & 0x3F80) + (paramInt1 >>> 25))]) != 0) {
/* 1823 */               paramArrayOfInt1[paramInt3] = (((paramInt2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt2 & 0xFF00) * i & 0xFF0000) >> 8);
/*      */             }
/* 1825 */             paramInt3++;
/* 1826 */             paramInt1 += j;
/* 1827 */             m--; } while (m > 0);
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fx
 * JD-Core Version:    0.6.2
 */