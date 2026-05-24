# PDI Stubs

Compile-only stub implementations of the Pentaho Data Integration (PDI) API.

Use these stubs to build PDI step plugins without a full PDI installation or access to Pentaho's private Maven repository (Hitachi Vantara Artifactory).

---

## Why this exists

Pentaho's Maven artifacts (`kettle-core`, `kettle-engine`, `kettle-ui-swt`, `metastore`) are hosted on a private Artifactory that requires authentication. These stubs provide just enough of the PDI API surface to compile a plugin — the real PDI jars on the PDI classpath are used at runtime.

---

## Modules

| Module | Replaces | Key classes stubbed |
|--------|----------|---------------------|
| `metastore-stub` | `pentaho:metastore` | `IMetaStore` |
| `kettle-core-stub` | `pentaho-kettle:kettle-core` | `BaseStepMeta`, `KettleException`, `RowMetaInterface`, `RowDataUtil`, `ValueMetaString`, `XMLHandler`, `@Step`, `BaseMessages`, `Const` |
| `kettle-engine-stub` | `pentaho-kettle:kettle-engine` | `BaseStep`, `BaseStepData`, `StepMetaInterface`, `StepInterface`, `Trans`, `TransMeta` |
| `kettle-ui-swt-stub` | `pentaho-kettle:kettle-ui-swt` | `BaseStepDialog`, `PropsUI` |

All stubs publish under the same `groupId:artifactId:version` as the real PDI artifacts so existing plugin `pom.xml` files work without changes.

---

## Usage

### 1. Install stubs to your local Maven repository

```bash
mvn install -DskipTests
```

This installs all four stub jars to `~/.m2/repository` under their real PDI coordinates:

```
pentaho:metastore:9.4.0.0-SNAPSHOT
pentaho-kettle:kettle-core:9.4.0.0-SNAPSHOT
pentaho-kettle:kettle-engine:9.4.0.0-SNAPSHOT
pentaho-kettle:kettle-ui-swt:9.4.0.0-SNAPSHOT
```

### 2. Build your plugin normally

```bash
cd your-pdi-plugin
mvn clean package -DskipTests
```

The stubs satisfy the `provided`-scope PDI dependencies at compile time. At runtime, the real PDI jars take over.

---

## SWT dependency

The `kettle-ui-swt-stub` pulls in the real SWT for macOS ARM from Maven Central:

```
org.eclipse.platform:org.eclipse.swt.cocoa.macosx.aarch64:3.130.0
```

If you are building on a different platform, update the SWT artifact in `kettle-ui-swt-stub/pom.xml`:

| Platform | Artifact |
|----------|----------|
| macOS ARM (Apple Silicon) | `org.eclipse.swt.cocoa.macosx.aarch64` |
| macOS Intel | `org.eclipse.swt.cocoa.macosx.x86_64` |
| Linux x86_64 | `org.eclipse.swt.gtk.linux.x86_64` |
| Windows x86_64 | `org.eclipse.swt.win32.win32.x86_64` |

---

## Compatibility

These stubs were written against the PDI 11.0.0.0-237 API (Pentaho 11) and are also compatible with PDI 9.4.x. The `version` is set to `9.4.0.0-SNAPSHOT` for broad compatibility with plugin `pom.xml` files targeting that range.

---

## Project using these stubs

- [csps-doc-id-generator](https://github.com/satishreddy13/csps-doc-id-generator) — CSPS DOC_ID Generator PDI step plugin
