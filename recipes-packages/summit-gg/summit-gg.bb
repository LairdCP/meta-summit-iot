SUMMARY = "Summit Greengrass Support"
DESCRIPTION = "Support for Greengrass V2 on Summit SOM 8M Plus"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI += "file://greengrass.service"

S = "${WORKDIR}"

FILES:${PN} += "${systemd_system_unitdir}"

SYSTEMD_SERVICE:${PN} = "greengrass.service"
SYSTEMD_AUTO_ENABLE = "enable"

inherit useradd systemd

# Configure Greengrass user and group via useradd
USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--uid 200 --gid 200 --home-dir /home/ggc_user --system --shell /bin/bash ggc_user"
GROUPADD_PARAM:${PN} = "--gid 200 ggc_group"

do_install () {
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -D -m 0644 ${S}/greengrass.service ${D}${systemd_system_unitdir}/greengrass.service
    fi
}
