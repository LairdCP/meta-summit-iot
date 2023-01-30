DESCRIPTION = "Summit SOM AWS Greengrass Image"

inherit image-summitsom-gen image-summitsom-sd-gen image-summitsom-swu-gen

CORE_IMAGE_EXTRA_INSTALL += "\
    ${IMAGE_INSTALL_BASIC} \
    libp11 \
    opensc \
    procps \
    sudo \
    openjre-8 \
    summit-gg \
	"
