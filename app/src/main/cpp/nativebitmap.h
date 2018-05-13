//
// Created by Abhinav Srivastava on 5/10/18.
//

#ifndef BITMAP_TO_JNI_NATIVEBITMAP_H
#define BITMAP_TO_JNI_NATIVEBITMAP_H

#endif //BITMAP_TO_JNI_NATIVEBITMAP_H

#ifndef NATIVEBITMAP
#define NATIVEBITMAP
#endif
typedef struct {
    unsigned int width;
    unsigned int height;
    unsigned int redWidth;
    unsigned int redHeight;
    unsigned int greenWidth;
    unsigned int greenHeight;
    unsigned int blueWidth;
    unsigned int blueHeight;
    unsigned char* red;
    unsigned char* green;
    unsigned char* blue;
} NativeBitmap;

void deleteBitmap(NativeBitmap* bitmap);
int initBitmapMemory(NativeBitmap* bitmap, int width, int height);
