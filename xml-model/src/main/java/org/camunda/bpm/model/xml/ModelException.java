/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.xml;

/**
 * <p>An Exception in the Core XML Model.</p>
 *
 * @author Daniel Meyer
 *
 */
public class ModelException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ModelException() {
    super();
  }

  public ModelException(String message, Throwable cause) {
    super(message, cause);
  }

  public ModelException(String message) {
    super(message);
  }

  public ModelException(Throwable cause) {
    super(cause);
  }

}