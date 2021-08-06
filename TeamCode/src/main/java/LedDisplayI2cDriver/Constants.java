package LedDisplayI2cDriver;

import com.qualcomm.robotcore.hardware.I2cAddr;

public class Constants {

    protected static final I2cAddr ADDRESS_I2C_DEFAULT = I2cAddr.create7bit(0x70);

    protected static final int BRIGHTNESS_DEFAULT = 0xF;
    protected static final int BLINK_RATE_DEFAULT = 0;
    protected static final boolean FONT_COLOR_DEFAULT = true;
    protected static final int DEFAULT_LINE_LENGTH = 0;

    protected static final int BYTE_LENGTH = 8;

    protected static final int DISPLAY_WIDTH = 8;
    protected static final int DISPLAY_HEIGHT = 8;

    public static final boolean LED_ON = true;
    public static final boolean LED_OFF = false;

    protected enum Command {
        DISPLAY_ADDRESS_POINTER((byte)0x0),
        SYSTEM_SETUP((byte)0x2),
        DISPLAY_SETUP((byte)0x8),
        SET_BRIGHTNESS((byte)0xE);


        public byte bVal;
        Command(byte value) { this.bVal = value; }
    }

    protected static final byte[] CHARACTERS = {
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, // Space
            (byte)0x00, (byte)0x00, (byte)0x5F, (byte)0x00, (byte)0x00, // !
            (byte)0x00, (byte)0x07, (byte)0x00, (byte)0x07, (byte)0x00, // "
            (byte)0x14, (byte)0x7F, (byte)0x14, (byte)0x7F, (byte)0x14, // #
            (byte)0x24, (byte)0x2A, (byte)0x7F, (byte)0x2A, (byte)0x12, // $
            (byte)0x23, (byte)0x13, (byte)0x08, (byte)0x64, (byte)0x62, // %
            (byte)0x36, (byte)0x49, (byte)0x56, (byte)0x20, (byte)0x50, // &
            (byte)0x00, (byte)0x08, (byte)0x07, (byte)0x03, (byte)0x00, // '
            (byte)0x00, (byte)0x1C, (byte)0x22, (byte)0x41, (byte)0x00, // (
            (byte)0x00, (byte)0x41, (byte)0x22, (byte)0x1C, (byte)0x00, // )
            (byte)0x2A, (byte)0x1C, (byte)0x7F, (byte)0x1C, (byte)0x2A, // *
            (byte)0x08, (byte)0x08, (byte)0x3E, (byte)0x08, (byte)0x08, // +
            (byte)0x00, (byte)0x80, (byte)0x70, (byte)0x30, (byte)0x00, // ,
            (byte)0x08, (byte)0x08, (byte)0x08, (byte)0x08, (byte)0x08, // -
            (byte)0x00, (byte)0x00, (byte)0x60, (byte)0x60, (byte)0x00, // .
            (byte)0x20, (byte)0x10, (byte)0x08, (byte)0x04, (byte)0x02, // /
            (byte)0x3E, (byte)0x51, (byte)0x49, (byte)0x45, (byte)0x3E, // 0
            (byte)0x00, (byte)0x42, (byte)0x7F, (byte)0x40, (byte)0x00, // 1
            (byte)0x72, (byte)0x49, (byte)0x49, (byte)0x49, (byte)0x46, // 2
            (byte)0x21, (byte)0x41, (byte)0x49, (byte)0x4D, (byte)0x33, // 3
            (byte)0x18, (byte)0x14, (byte)0x12, (byte)0x7F, (byte)0x10, // 4
            (byte)0x27, (byte)0x45, (byte)0x45, (byte)0x45, (byte)0x39, // 5
            (byte)0x3C, (byte)0x4A, (byte)0x49, (byte)0x49, (byte)0x31, // 6
            (byte)0x41, (byte)0x21, (byte)0x11, (byte)0x09, (byte)0x07, // 7
            (byte)0x36, (byte)0x49, (byte)0x49, (byte)0x49, (byte)0x36, // 8
            (byte)0x46, (byte)0x49, (byte)0x49, (byte)0x29, (byte)0x1E, // 9
            (byte)0x00, (byte)0x00, (byte)0x14, (byte)0x00, (byte)0x00, // :
            (byte)0x00, (byte)0x40, (byte)0x34, (byte)0x00, (byte)0x00, // ;
            (byte)0x00, (byte)0x08, (byte)0x14, (byte)0x22, (byte)0x41, // <
            (byte)0x14, (byte)0x14, (byte)0x14, (byte)0x14, (byte)0x14, // =
            (byte)0x00, (byte)0x41, (byte)0x22, (byte)0x14, (byte)0x08, // >
            (byte)0x02, (byte)0x01, (byte)0x59, (byte)0x09, (byte)0x06, // ?
            (byte)0x3E, (byte)0x41, (byte)0x5D, (byte)0x59, (byte)0x4E, // @
            (byte)0x7C, (byte)0x12, (byte)0x11, (byte)0x12, (byte)0x7C, // A
            (byte)0x7F, (byte)0x49, (byte)0x49, (byte)0x49, (byte)0x36, // B
            (byte)0x3E, (byte)0x41, (byte)0x41, (byte)0x41, (byte)0x22, // C
            (byte)0x7F, (byte)0x41, (byte)0x41, (byte)0x41, (byte)0x3E, // D
            (byte)0x7F, (byte)0x49, (byte)0x49, (byte)0x49, (byte)0x41, // E
            (byte)0x7F, (byte)0x09, (byte)0x09, (byte)0x09, (byte)0x01, // F
            (byte)0x3E, (byte)0x41, (byte)0x41, (byte)0x51, (byte)0x73, // G
            (byte)0x7F, (byte)0x08, (byte)0x08, (byte)0x08, (byte)0x7F, // H
            (byte)0x00, (byte)0x41, (byte)0x7F, (byte)0x41, (byte)0x00, // I
            (byte)0x20, (byte)0x40, (byte)0x41, (byte)0x3F, (byte)0x01, // J
            (byte)0x7F, (byte)0x08, (byte)0x14, (byte)0x22, (byte)0x41, // K
            (byte)0x7F, (byte)0x40, (byte)0x40, (byte)0x40, (byte)0x40, // L
            (byte)0x7F, (byte)0x02, (byte)0x1C, (byte)0x02, (byte)0x7F, // M
            (byte)0x7F, (byte)0x04, (byte)0x08, (byte)0x10, (byte)0x7F, // N
            (byte)0x3E, (byte)0x41, (byte)0x41, (byte)0x41, (byte)0x3E, // O
            (byte)0x7F, (byte)0x09, (byte)0x09, (byte)0x09, (byte)0x06, // P
            (byte)0x3E, (byte)0x41, (byte)0x51, (byte)0x21, (byte)0x5E, // Q
            (byte)0x7F, (byte)0x09, (byte)0x19, (byte)0x29, (byte)0x46, // R
            (byte)0x26, (byte)0x49, (byte)0x49, (byte)0x49, (byte)0x32, // S
            (byte)0x03, (byte)0x01, (byte)0x7F, (byte)0x01, (byte)0x03, // T
            (byte)0x3F, (byte)0x40, (byte)0x40, (byte)0x40, (byte)0x3F, // U
            (byte)0x1F, (byte)0x20, (byte)0x40, (byte)0x20, (byte)0x1F, // V
            (byte)0x3F, (byte)0x40, (byte)0x38, (byte)0x40, (byte)0x3F, // W
            (byte)0x63, (byte)0x14, (byte)0x08, (byte)0x14, (byte)0x63, // X
            (byte)0x03, (byte)0x04, (byte)0x78, (byte)0x04, (byte)0x03, // Y
            (byte)0x61, (byte)0x59, (byte)0x49, (byte)0x4D, (byte)0x43, // Z
            (byte)0x00, (byte)0x7F, (byte)0x41, (byte)0x41, (byte)0x41, // [
            (byte)0x02, (byte)0x04, (byte)0x08, (byte)0x10, (byte)0x20, // \
            (byte)0x00, (byte)0x41, (byte)0x41, (byte)0x41, (byte)0x7F, // ]
            (byte)0x04, (byte)0x02, (byte)0x01, (byte)0x02, (byte)0x04, // ^
            (byte)0x40, (byte)0x40, (byte)0x40, (byte)0x40, (byte)0x40, // _
            (byte)0x00, (byte)0x03, (byte)0x07, (byte)0x08, (byte)0x00, // `
            (byte)0x20, (byte)0x54, (byte)0x54, (byte)0x78, (byte)0x40, // a
            (byte)0x7F, (byte)0x28, (byte)0x44, (byte)0x44, (byte)0x38, // b
            (byte)0x38, (byte)0x44, (byte)0x44, (byte)0x44, (byte)0x28, // c
            (byte)0x38, (byte)0x44, (byte)0x44, (byte)0x28, (byte)0x7F, // d
            (byte)0x38, (byte)0x54, (byte)0x54, (byte)0x54, (byte)0x18, // e
            (byte)0x00, (byte)0x08, (byte)0x7E, (byte)0x09, (byte)0x02, // f
            (byte)0x18, (byte)0xA4, (byte)0xA4, (byte)0x9C, (byte)0x78, // g
            (byte)0x7F, (byte)0x08, (byte)0x04, (byte)0x04, (byte)0x78, // h
            (byte)0x00, (byte)0x44, (byte)0x7D, (byte)0x40, (byte)0x00, // i
            (byte)0x20, (byte)0x40, (byte)0x40, (byte)0x3D, (byte)0x00, // j
            (byte)0x7F, (byte)0x10, (byte)0x28, (byte)0x44, (byte)0x00, // k
            (byte)0x00, (byte)0x41, (byte)0x7F, (byte)0x40, (byte)0x00, // l
            (byte)0x7C, (byte)0x04, (byte)0x78, (byte)0x04, (byte)0x78, // m
            (byte)0x7C, (byte)0x08, (byte)0x04, (byte)0x04, (byte)0x78, // n
            (byte)0x38, (byte)0x44, (byte)0x44, (byte)0x44, (byte)0x38, // o
            (byte)0xFC, (byte)0x18, (byte)0x24, (byte)0x24, (byte)0x18, // p
            (byte)0x18, (byte)0x24, (byte)0x24, (byte)0x18, (byte)0xFC, // q
            (byte)0x7C, (byte)0x08, (byte)0x04, (byte)0x04, (byte)0x08, // r
            (byte)0x48, (byte)0x54, (byte)0x54, (byte)0x54, (byte)0x24, // s
            (byte)0x04, (byte)0x04, (byte)0x3F, (byte)0x44, (byte)0x24, // t
            (byte)0x3C, (byte)0x40, (byte)0x40, (byte)0x20, (byte)0x7C, // u
            (byte)0x1C, (byte)0x20, (byte)0x40, (byte)0x20, (byte)0x1C, // v
            (byte)0x3C, (byte)0x40, (byte)0x30, (byte)0x40, (byte)0x3C, // w
            (byte)0x44, (byte)0x28, (byte)0x10, (byte)0x28, (byte)0x44, // x
            (byte)0x4C, (byte)0x90, (byte)0x90, (byte)0x90, (byte)0x7C, // y
            (byte)0x44, (byte)0x64, (byte)0x54, (byte)0x4C, (byte)0x44, // z
            (byte)0x00, (byte)0x08, (byte)0x36, (byte)0x41, (byte)0x00, // {
            (byte)0x00, (byte)0x00, (byte)0x77, (byte)0x00, (byte)0x00, // |
            (byte)0x00, (byte)0x41, (byte)0x36, (byte)0x08, (byte)0x00, // }
            (byte)0x02, (byte)0x01, (byte)0x02, (byte)0x04, (byte)0x02, // ~
            (byte)0x3C, (byte)0x26, (byte)0x23, (byte)0x26, (byte)0x3C  // Delete
    };

    protected static final int CHARACTER_WIDTH = 5;
    protected static final int CHARACTER_HEIGHT = 7;
    protected static final int TRACKING = 1; // space between characters
    protected static final int LEADING = 1; // space between lines
}
