Ghoti-One boot layout
=====================
The bootloader loads /boot/image.fit from this rootfs into RAM at 0x40800000
and hands off with `bootm 0x40800000#${bootconfig}`. The bootconfig variable
is set by U-Boot env; see the redundant env sectors in the NAND boot area.

The FIT bundle contains a production configuration (conf@1) and a
factory-only diagnostic configuration (conf@2) left over from wafer test.
Only conf@1 is signed; do NOT boot conf@2 in the field.
