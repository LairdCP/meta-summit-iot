ICEDTEA_HG_URL = "http://icedtea.wildebeest.org/hg/release/${ICEDTEA_PREFIX}"

# Disable LDD due to segfault issue in Ubuntu 22.04: https://bugs.launchpad.net/ubuntu/+source/glibc/+bug/1995362
EXTRA_OEMAKE:append = " LDD=:"
