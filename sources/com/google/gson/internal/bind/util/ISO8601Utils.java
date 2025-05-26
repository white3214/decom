package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import top.tntok.autobot.C0089o000Ooo;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    private static final String UTC_ID = "UTC";

    private static boolean checkOffset(String str, int i, char c) {
        if (i >= str.length() || str.charAt(i) != c) {
            return false;
        }
        return true;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            r1 = r19
            r2 = r20
            java.lang.String r3 = "'"
            int r0 = r20.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r4 = r0 + 4
            int r5 = parseInt(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r6 = 45
            boolean r7 = checkOffset(r1, r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r8 = 5
            if (r7 == 0) goto L_0x001b
            int r4 = r0 + 5
        L_0x001b:
            int r0 = r4 + 2
            int r7 = parseInt(r1, r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            boolean r9 = checkOffset(r1, r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r9 == 0) goto L_0x0029
            int r0 = r4 + 3
        L_0x0029:
            int r4 = r0 + 2
            int r9 = parseInt(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r10 = 84
            boolean r10 = checkOffset(r1, r4, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r11 = 1
            if (r10 != 0) goto L_0x0055
            int r12 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r12 > r4) goto L_0x0055
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r7 = r7 - r11
            r0.<init>(r5, r7, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r2.setIndex(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.util.Date r0 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            return r0
        L_0x004c:
            r0 = move-exception
            goto L_0x01cf
        L_0x004f:
            r0 = move-exception
            goto L_0x01cf
        L_0x0052:
            r0 = move-exception
            goto L_0x01cf
        L_0x0055:
            r12 = 43
            r13 = 90
            r15 = 2
            if (r10 == 0) goto L_0x00d9
            int r4 = r0 + 3
            int r10 = r0 + 5
            int r4 = parseInt(r1, r4, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r14 = 58
            boolean r16 = checkOffset(r1, r10, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r16 == 0) goto L_0x006e
            int r10 = r0 + 6
        L_0x006e:
            int r0 = r10 + 2
            int r16 = parseInt(r1, r10, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            boolean r14 = checkOffset(r1, r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r14 == 0) goto L_0x007d
            int r10 = r10 + 3
            r0 = r10
        L_0x007d:
            int r10 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r10 <= r0) goto L_0x00cf
            char r10 = r1.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r10 == r13) goto L_0x00cf
            if (r10 == r12) goto L_0x00cf
            if (r10 == r6) goto L_0x00cf
            int r10 = r0 + 2
            int r14 = parseInt(r1, r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r8 = 59
            if (r14 <= r8) goto L_0x009d
            r8 = 63
            if (r14 >= r8) goto L_0x009d
            r14 = 59
        L_0x009d:
            r8 = 46
            boolean r8 = checkOffset(r1, r10, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r8 == 0) goto L_0x00c9
            int r8 = r0 + 3
            int r10 = r0 + 4
            int r10 = indexOfNonDigit(r1, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r10, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r17 = parseInt(r1, r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r0 = r0 - r8
            if (r0 == r11) goto L_0x00c0
            if (r0 == r15) goto L_0x00bd
            goto L_0x00c2
        L_0x00bd:
            int r17 = r17 * 10
            goto L_0x00c2
        L_0x00c0:
            int r17 = r17 * 100
        L_0x00c2:
            r0 = r4
            r4 = r10
            r8 = r16
            r10 = r17
            goto L_0x00dd
        L_0x00c9:
            r0 = r4
            r4 = r10
            r8 = r16
            r10 = 0
            goto L_0x00dd
        L_0x00cf:
            r8 = r16
            r10 = 0
            r14 = 0
            r18 = r4
            r4 = r0
            r0 = r18
            goto L_0x00dd
        L_0x00d9:
            r0 = 0
            r8 = 0
            r10 = 0
            r14 = 0
        L_0x00dd:
            int r15 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r15 <= r4) goto L_0x01c7
            char r15 = r1.charAt(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r15 != r13) goto L_0x00ee
            java.util.TimeZone r6 = TIMEZONE_UTC     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r4 = r4 + r11
            goto L_0x0195
        L_0x00ee:
            if (r15 == r12) goto L_0x010d
            if (r15 != r6) goto L_0x00f3
            goto L_0x010d
        L_0x00f3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r4.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r5 = "Invalid time zone indicator '"
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r4.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r4.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
        L_0x010d:
            java.lang.String r6 = r1.substring(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r12 = r6.length()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r13 = 5
            if (r12 < r13) goto L_0x0119
            goto L_0x012a
        L_0x0119:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r12.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r12.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r6 = "00"
            r12.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r6 = r12.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
        L_0x012a:
            int r12 = r6.length()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r4 = r4 + r12
            java.lang.String r12 = "+0000"
            boolean r12 = r12.equals(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r12 != 0) goto L_0x0193
            java.lang.String r12 = "+00:00"
            boolean r12 = r12.equals(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r12 == 0) goto L_0x0140
            goto L_0x0193
        L_0x0140:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r12.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r13 = "GMT"
            r12.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r12.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r6 = r12.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r13 = r12.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            boolean r15 = r13.equals(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r15 != 0) goto L_0x0191
            java.lang.String r15 = ":"
            java.lang.String r11 = ""
            java.lang.String r11 = r13.replace(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            boolean r11 = r11.equals(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            if (r11 == 0) goto L_0x016e
            goto L_0x0191
        L_0x016e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r4.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r4.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r5 = " given, resolves to "
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r5 = r12.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
        L_0x0191:
            r6 = r12
            goto L_0x0195
        L_0x0193:
            java.util.TimeZone r6 = TIMEZONE_UTC     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
        L_0x0195:
            java.util.GregorianCalendar r11 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r11.<init>(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r6 = 0
            r11.setLenient(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r6 = 1
            r11.set(r6, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            int r7 = r7 - r6
            r5 = 2
            r11.set(r5, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r5 = 5
            r11.set(r5, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r5 = 11
            r11.set(r5, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r0 = 12
            r11.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r0 = 13
            r11.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r0 = 14
            r11.set(r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            r2.setIndex(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.util.Date r0 = r11.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            return r0
        L_0x01c7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            java.lang.String r4 = "No time zone indicator"
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c }
        L_0x01cf:
            if (r1 != 0) goto L_0x01d3
            r1 = 0
            goto L_0x01e7
        L_0x01d3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 34
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L_0x01e7:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01f3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0211
        L_0x01f3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0211:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
        }
        return -i3;
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        char c = '-';
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append(C0089o000Ooo.il1LilLllii);
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            if (offset >= 0) {
                c = '+';
            }
            sb.append(c);
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
