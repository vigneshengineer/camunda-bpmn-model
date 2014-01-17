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
package org.camunda.bpm.model.xml.type.reference;

import org.camunda.bpm.model.xml.instance.ModelElementInstance;
import org.camunda.bpm.model.xml.type.attribute.Attribute;

/**
 *
 * @author Sebastian Menski
 *
 * @param <T> the type of the referenced element
 */
public interface Reference<T extends ModelElementInstance> {

  /**
   * Get the reference identifier which is set in the reference source
   *
   * @param referenceSourceElement the reference source model element instance
   * @return the reference identifier
   */
  String getReferenceIdentifier(ModelElementInstance referenceSourceElement);

  T getReferencedElement(ModelElementInstance modelElement);

  void setReferencedElement(ModelElementInstance referenceSourceElement, T referenceTargetElement);

  Attribute<String> getReferenceTargetAttribute();

}
