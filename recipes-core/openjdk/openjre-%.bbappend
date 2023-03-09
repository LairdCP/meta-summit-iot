# This fixes a build error in adlc under GCC 7 (the patch exists
# but doesn't apply without these)
export TARGET_CFLAGS
export TARGET_CXXFLAGS