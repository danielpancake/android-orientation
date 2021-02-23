#ifndef STATIC_LINK
#define IMPLEMENT_API
#endif

#include <hx/CFFI.h>

extern "C" void androidorientation_main() {
    val_int(0); // Fix Neko init
} DEFINE_ENTRY_POINT(androidorientation_main);
extern "C" int androidorientation_register_prims() { return 0; }