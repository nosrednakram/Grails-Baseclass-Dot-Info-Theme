//
// This script is executed by Grails after plugin was installed to project.
// This script is a Gant script so you can use all special variables provided
// by Gant (such as 'baseDir' which points on project base dir). You can
// use 'ant' to access a global instance of antBuilder
//
// Install view scaffolding templates
//
ant.mkdir(dir: "${basedir}/src/templates/scaffolding/")
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/create.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/edit.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/list.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/show.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
//
// Common Blocks
//
ant.mkdir(dir: "${basedir}/grails-app/views/common/")
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_footer.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_mainnav.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_search.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_useroptions.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: true)
//
// Layouts
//
ant.copy(file:  "${pluginBasedir}/grails-app/views/layouts/root.gsp",
         todir: "${basedir}/grails-app/views/layouts",
         overwrite: true)
//
// Theme Page
//
ant.copy(file:  "${pluginBasedir}/grails-app/views/theme.gsp",
         todir: "${basedir}/grails-app/views",
         overwrite: true)
// 
// URL Mapping for Theme Example/Docs
//
ant.copy(file:  "${pluginBasedir}/grails-app/conf/ThemeUrlMappings.groovy",
         todir: "${basedir}/grails-app/conf",
         overwrite: true)
