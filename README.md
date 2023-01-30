# meta-summit-iot: Summit SOM IoT Meta Layer
This Yocto meta layer provides support for IoT services running
on Summit Linux on the Summit SOM 8M Plus.

## AWS Greengrass (V2)
AWS Greengrass (V2) support is provided via the `summitsom-greengrass` distro and
the `image-summitsom-gg` image.  To build the image, checkout using the
corresponding repo manifest (som8mp-iot.xml) and run the following
command to create the build environment:

    $ MACHINE=imx8mp-summitsom DISTRO=summitsom-greengrass TEMPLATECONF="$(pwd)/sources/meta-summit-iot/conf" . setup-environment build && bitbake image-summitsom-gg